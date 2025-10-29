// Ayaan Rizvi
// P2
// Zero-Hero
// 10/28/2025

/*
 * DESCRIPTION: The table class represents a table with legs and a top, allowing customization of its appearance.There will also be a cake centered on the table
 * Input: Number of legs and width of the table
 * Output: A visual representation of the table with a cake in the terminal
 * Edge Case: I dont think there are any but maybe having to deal with the fencepost problem
 */





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
