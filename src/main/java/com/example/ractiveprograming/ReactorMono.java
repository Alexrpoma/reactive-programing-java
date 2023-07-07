package com.example.ractiveprograming;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class ReactorMono {
  public static void run() {
    log.info("Reactor Mono");
    Mono.just(new Shape("Triangle", "Blue"))
        .doOnNext(obj -> obj.description("This is a triangle!")) //With doOnNext we can do some process on the object.
        .subscribe(System.out::println);
  }
}
