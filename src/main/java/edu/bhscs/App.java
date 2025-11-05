package edu.bhscs;

public class App {

  public static void main(String[] args) {}
  
  // let's get this to the web!
  public static void date_10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);
  }
}

// at 10/31 at 9:37 A.M. I am in the local github...
// test
