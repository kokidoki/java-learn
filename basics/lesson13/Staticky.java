package lesson13;
public class Staticky {
  static public int staticCounter = 0;
  public int counter = 0;

  public static void incrementStaticCounter() { // CANNOT USE INSTANCE VARS OR THIS IN STATIC METHOD; CAN'T CALL INSTANCE METHOD
    staticCounter++;
  }

  public void incrementCounter() { // THIS IS INSTANCE METHOD — REQUIRES INSTANCE OF CLASS TO CALL
    this.counter++;
  }
}
