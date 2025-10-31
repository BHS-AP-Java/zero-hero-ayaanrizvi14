package edu.bhscs;

public class PTSA {
  int funds;

  public PTSA() {
    this.funds = 0;
    System.out.println("PTSA created with initial funds: $" + this.funds);
  }

  public void addFunds(int amount) {
    this.funds += amount;
    System.out.println("PTSA funds increased by $" + amount + ". Total funds: $" + this.funds);
  }

  public int getFunds() {
    return this.funds;
  }
}
