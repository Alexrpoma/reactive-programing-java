package com.example.ractiveprograming;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
public class ReactorFlux {
  public static void run() {
    log.info("Reactor Flux");
    List<Shape> shapes = List.of(
        new Shape("Triangle", "Red"),
        new Shape("Square", "Green"),
        new Shape("Circle", "Orange")
    );
    Flux.fromIterable(shapes).subscribe(System.out::println);
  }
}
