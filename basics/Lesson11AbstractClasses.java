public class Lesson11AbstractClasses {
  public static void main(String[] args) {

    Car armada = new Car();
    // armada.start();
    // armada.stop();

    Boat boat = new Boat();
    // boat.start();
    // boat.stop();

    Engine e = new Boat();
    ((Boat)e).setHorsepower(1000);
    // e.start();
    // e.stop();

    // Engine e2 = engineFactory("Boat");
    // e2.start();
    // e2.start();
    Engine e2 = engineFactory(args[0]); // POLYMORPHISM
    e2.start();
    e2.stop();
  }

  // Polymophism can work with all parent classes, not just abstract

  public static Engine engineFactory(String engineType) { // POLYMORPHISM
    if (engineType.equals("Boat")) {
      return new Boat();
    } else {
      return new Car();
    }
  }


  abstract public static class Engine { // Abstract can hold 0+ abstract methods(can hold normal); cannot be instantiated(has to be extended to be used)
    // public void start() {
    //   System.out.println("Start");
    // }
    //
    // public void stop() {
    //   System.out.println("Stop");
    // }
    abstract public void start();
    abstract public void stop();
  }
  public static class Car extends Engine { // Children of Abstract class aka "Concrete classes"
    public Car() {
      super();
    }
    public void start() {
      System.out.println("Start Car");
    }

    public void stop() {
      System.out.println("Stop Car");
    }
  }

  public static class Boat extends Engine {
    int horsepower;

    public void start() {
      System.out.println("Start Bat");
    }

    public void stop() {
      System.out.println("Stop Boat");
    }

    public int getHorsepower() {
      return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
      this.horsepower = horsepower;
    }
  }
}
