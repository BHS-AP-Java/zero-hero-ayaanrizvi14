package edu.bhscs;

public class Customer {
  String name;
  int money;

  public Customer(String name, int money) {

    this.name = name;
    this.money = money;
    System.out.println("Customer created: " + name + " with $" + money);
  }

  public void buyCake(Cake cake, PTSA ptsa, int price) {
    if (this.money >= price) {
      this.money -= price;
      ptsa.addFunds(price);
      System.out.println(this.name + " bought the cake for $" + price);
    } else {
      System.out.println(this.name + " does not have enough money to buy the cake.");
    }
  }
}
