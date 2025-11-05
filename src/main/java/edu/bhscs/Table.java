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
  String leg;
  String theWidth;

  // Constructor
  public Table(int legs, int theWidth) {
    this.legs = legs;
    this.width = theWidth;
    System.out.println("TABLE IS ALIVEEEE");
  }

  public void setLegs(String legs) {
    this.leg = legs;
  }

  public void setWidth(String theWidth) {
    this.width = theWidth;
  }

  // here is where I will create the top of the table
  public void drawTop() {
    for (int i = 0; i < width; i++) {
      System.out.print(width);
    }
    System.out.println();
  }

  // Here is where I will create the legs of the table
  public void drawLegs() {
    for (int i = 0; i < legs; i++) {
<<<<<<< HEAD
      System.out.print(leg);


=======
      System.out.print(legChar);
>>>>>>> 7bf7eb8 (Testing)
    }
  }

  public int gedWidth() {
    return width;
  }

  public void setOffset(int offset) {
    System.out.println("offset = " + offset);
  }
  // need loops for both of these

  // Methods
  }
}
