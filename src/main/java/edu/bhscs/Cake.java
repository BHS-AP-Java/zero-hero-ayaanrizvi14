package edu.bhscs;

public class Cake {
  String ingredient1;
  String ingredient2;
  int weight;
  String person;
  public String ingredient;

  public Cake(String ingredient, String person) {
    System.out.println("baking the cake with ingredients like " + ingredient + " and vanilla!");
    this.weight = 10; // weight of cake in pounds
    this.ingredient1 = ingredient;
    this.person = person;
  }

  public void addIngredient(String ingredient) {
    this.ingredient2 = ingredient;
    System.out.println("Added ingredient: " + ingredient);
  }

  public void showIngredients() {
    System.out.println("Ingredients: " + ingredient1 + ", " + ingredient2);
    System.out.println("Baked by: " + person);
  }

  public void eaten() {
    this.weight = this.weight - 2;
  }

  public int getWeight() {
    return this.weight;
  }
}
