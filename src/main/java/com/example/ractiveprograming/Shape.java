package com.example.ractiveprograming;

public record Shape(String name, String color) {
  public void description(String description) {
    System.out.println(description);
  }
}
