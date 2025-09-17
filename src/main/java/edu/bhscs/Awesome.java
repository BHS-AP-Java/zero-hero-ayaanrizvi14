package edu.bhscs;

public class Awesome {
//fields/properties/this is the stuff that AWESOME has
  String name;

// We need to CONSTRUCT something AWESOME!!!
  public Awesome(String name){
    System.out.println("I am the most AWESOME " + name + "!");
    this.name = name;
  }

  String getName() {
    return this.name;
  }


}