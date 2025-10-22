package edu.bhscs;

public class Customer {
  String name;
  int money;
  String ingredient;

  public Customer(String name, int money) {

    this.name = name;
    this.money = money;
    System.out.println("Customer created: " + name + " with $" + money);
  }

  public int pay(int price) {
    if (this.money >= price) {
      this.money -= price;
      System.out.println(this.name + " paid $" + price + ". Remaining money: $" + this.money);
      return price;
    } else {
      System.out.println(this.name + " does not have enough money to pay $" + price);
      return 0;
    }
  }

  public void takeCake(Cake cake) {
    System.out.println(this.name + " received the cake with ingredient: " + cake.ingredient);
  }
}
