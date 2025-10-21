package edu.bhscs;

import java.util.Scanner;

public class Player {

  private String name;
  private Scanner s;
  int accomplishments;

  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void accomplish(int amount) {
    this.accomplishments += amount;
    System.out.println(this.name + " has accomplished " + this.accomplishments + " things!");
  }

  public void answerQuestions() {
    System.out.println(name + ", what's your question?");
    String question = this.s.next();
    System.out.println(question + " is a very dumb question");
  }

  public String giveAnswer(String question) {
    System.out.println(question);
    return s.nextLine();
  }
}
