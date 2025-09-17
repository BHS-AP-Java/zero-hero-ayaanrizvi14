// Ayaan Rizvi
// P2
// Zero-Hero
// 9/12/2025

/*
 * DESCRIPTION: Whatever Mr Reiber says
 * INPUT: We don't know about input yet
 * OUTPUT: Some cool words in the command line thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

class Main {

  // This is an example of a char content
  // Because it is global, it should be in capital letters
  public static final float NAME_OF_THIS_FLOAT = 69.42f;
  public static final char A = 'a';

  public static void main(String[] args) {

    System.out.println(A);
    String myString = pushup("Garlic");
    System.out.println(myString);
    System.out.println(myString);
    System.out.println(myString);

    Awesome steve = new Awesome("Steve");
    Awesome sue = new Awesome("Sue");
    Awesome linda = new Awesome("L");
    Awesome jhon = new Awesome("with a JH, dumb-ass");

    System.out.println( steve.getName("Steve") );
    System.out.println( sue.getName("Sue") );
    System.out.println( linda.getName("L") );
    System.out.println( jhon.getName("with a JH, dumb-ass") );

  }

  public static String pushup(String food){
    return "sweat" + food;
  }
}
