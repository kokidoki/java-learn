import lesson13.*;
public class Lesson13StaticAndInnerClass {
  public static void main(String[] args) {

    Staticky sticky = new Staticky();
    // System.out.println(sticky.counter);
    // sticky.incrementCounter();
    // System.out.println(sticky.counter);
    //
    // Staticky slimy = new Staticky();
    // System.out.println(slimy.counter);
    // System.out.println(Staticky.staticCounter);
    // Staticky.incrementStaticCounter();
    // System.out.println(Staticky.staticCounter);
    // System.out.println(sticky.counter);

    sticky.incrementStaticCounter(); // ALWAYS USE CLASS NAME WITH STATIC VARIABLES — THIS IS BAD EXAMPLE
    // System.out.println(sticky.staticCounter);
    // System.out.println(sticky.counter);




    Biggie big = new Biggie();
    System.out.println(big);

    Biggie.Minie minmin = new Biggie.Minie();
    System.out.println(minmin);

    Biggie.Tinie tin = big.new Tinie();
    System.out.println(tin);
  }
}
