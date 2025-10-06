package edu.bhscs;

public class Baker {
  // This is a constructor
  public Baker() {
    System.out.println("Baker created");
  }

  public Cake bakeCake() {

    return new Cake("Chocolate", "Ayaan");
  }
}
