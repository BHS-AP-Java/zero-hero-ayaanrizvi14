package edu.bhscs;

public class Player {

  public static void main(String[] args) {

    String name;
    Scanner s;

    public Player(String name) {
      this.name = name;
      this.s = new Scanner(System.in);
    }

    public void answerQuestions(){
      System.out.println("Whats your question?");
      String question = this.s.next();
      System.out.println(question + "is a very dumb question");
    }
}
