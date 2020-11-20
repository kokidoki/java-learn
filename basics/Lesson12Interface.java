public class Lesson12Interface {

  public static void main(String[] args) {

    Engine a = new Car();
    a.start();
    System.out.println(((Car)a).getIsStarted());
    if (a instanceof Navigation) {
      Navigation c = (Navigation)a;
      System.out.println(c.address());
    }
    a.stop();

    Engine b = new Boat();
    b.start();
    System.out.println(((Boat)b).getIsStarted());
    b.stop();
  }

  abstract public static class CommonEngine implements Engine{

      protected boolean isStarted = false;
      protected String vehicleType;

      public void start() {
        System.out.println(this.vehicleType + " Start");
        this.isStarted = true;
      }

      public void stop() {
        System.out.println(this.vehicleType + " Stop");
        this.isStarted = false;
      }

      public boolean getIsStarted() {
        return this.isStarted;
      }
  }

  public static interface Engine {
    void start();
    void stop();
  }

  public static interface Navigation {
    String address();
  }

  public static class Car extends CommonEngine implements Navigation {

    public Car() {
      this.vehicleType = "Car";
    }

    public String address() {
      return "Your address is undefined";
    }

  }

  public static class Boat extends CommonEngine {

    public Boat() {
      this.vehicleType = "Boat";
    }

  }
}
