package edu.bhscs;

public class Table {
  // Properties and fields
  int legs;
  int width;
  String legChar = "|";
  String topChar = "-";

  // Constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    System.out.println("TABLE IS ALIVEEEE");
  }

  public void setLegs(String legs) {
    this.legChar = legs;

  }
  public void setTop(String top) {
    this.topChar = top;
  }

  // Methods
}
