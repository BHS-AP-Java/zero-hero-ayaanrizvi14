package edu.bhscs;

public class Table {
  // Properties and fields
  int legs;
  int width;
  String legChar = "|";  // the specific charector that depicts the legs
  String topChar = "-";  // the specific charector that depicts the top of the table

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

  // here is where I will create the top of the table

  // Here is where I will create the legs of the table
  
  // need loops for both of these



  // Methods
}
