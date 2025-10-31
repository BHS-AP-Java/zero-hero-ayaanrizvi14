package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  String name;
  Player p;
  Flour f;
  Store placeOfWork;
  int skill;
  int cash;
  int bakes;


  // CONSTRUCTOR
  public Baker(String name){
    this.name = name;
  }
  public Baker(Player p) {
    this.p = p;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  public void learn(int amount){
    this.skill += amount;
    //Make the baker skill level effect the quality of the cake
    //Make a bad baker make bad cakes
    //Make a good baker make good cakes
    //Make a great baker make great cakes
    //Make a master baker make masterful cakes
    this.p.accomplish(amount);

  }
  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    this.skill ++;
    return new Cake(answer, this.f);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  public Baker(){
  }
  Cake bakes(int size, String Who){
    return new Cake();
  }
}
