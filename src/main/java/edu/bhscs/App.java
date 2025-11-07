package edu.bhscs;

public class App {
  public static void main(String[] args) {
    System.out.println("hi");

    date_11_5();

    new Table();
  }

  public static void date_11_5() {
    System.out.println("frack the gods");
  }
  interface Offsetable {
    int getWidth();

    // Default centering logic — always clamps to 0 so alignment never goes negative.
    default int getOffset(Offsetable below) {
      if (below == null)
        return 0;
      return Math.max(0, (below.getWidth() - this.getWidth()) / 2);
    }

    // Each Offsetable thing knows how to draw itself
    // relative to whatever is beneath it.
    void draw(Offsetable below);
}
}
