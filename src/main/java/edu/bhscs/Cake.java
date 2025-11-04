package edu.bhscs;

public class Cake {

//PROPERTIES AND FIELDS
  String ingredient1;
  String ingredient2;
  String person;
  String icing;
  Flour flour;
  int weight;
  int price;
  int height; // how many rows tall
  int width;  // How many characters per row
  int layers; // Stacks of layers

void centerlength(Table t){
  int cakeWidth;
  int tableWidth;
  int offset;
  int tableOffset;
  int cakeOffset;
}



//CONSTRUCTOR
  public Cake(){

  }
  public Cake(String icing, int height, int width, int layers) {
    this.icing = icing;
    this.height = height;
    this.width = width;
    this.layers = layers;
  }


// METHOD
  void draw(){
    // Top if icing layer
    System.out.println(icing.repeat(width));
    // This is a loop for each layer
    for (int l = 0; l < layers; l++) {
      //drawing columns for this layer
      for(int i = 0; i < height; i++) {
        //drawing rows for this layer
        for (int j = 0; j < width; j++){
          //Randomly puts sprinkles to add texture
          double rand = Math.random();
          char sprinkle = rand < 0.333 ? '#' : (rand < 0.666 ? '*' : '=');
          System.out.print(sprinkle);
        }
        System.out.println(); //Next row

      }


    if ( l < layers - 1) {
      System.out.println("-".repeat(width));
    }

    System.out.println("=".repeat(width));

  }
}

public static void main(String[] args) {
  Cake myCake = new Cake("~", 5, 20, 3);
  myCake.draw();
}


if(offset < 0) { /* do the right thing when myTable is bigger */ }
else { /* do the right thing when the cake is bigger  */ }






























//* */

  public Cake(String ingredient, Flour flour) {
    System.out.println(
        "baking the cake with ingredients like "
            + ingredient
            + " and "
            + flour.getType()
            + " flour!");
    this.weight = 10; // weight of cake in pounds
    this.ingredient1 = ingredient;
    this.flour = flour;
  }

  public void addIngredient(String ingredient) {
    this.ingredient2 = ingredient;
    System.out.println("Added ingredient: " + ingredient);
  }

  public void showIngredients() {
    System.out.println("Ingredients: " + ingredient1 + ", " + ingredient2);
  }

  public void eaten() {
    this.weight = this.weight - 2;
    System.out.println("someone ate the cake! Remaining weight: " + this.weight + " pounds.");
  }

  public int getWeight() {
    return this.weight;
  }

  public String getType() {
    return this.ingredient1;
  }
  public void draw(Table t) {
    this.draw();
  }
}

//*
