//Java only supports single parent inheritance(can only extend once per class)
//New keyword will instentiate/create new Instance
//Instance/Object interchangeable
public class Lesson8_classInheritance {
	public static void main(String[] args) {
		Car honda = new Car("Rainbow");
		// System.out.println(honda);

		// Truck neighborTruck = new Truck("black");
		// Truck neighborTruck = new Truck();
		// Truck neighborTruck = new Truck("", 150);
		Truck neighborTruck = new Truck(Car.DEFAULT_COLOR, 1550);
		System.out.println(neighborTruck);
	}

	public static class Car {
		public String color;
		final public static String DEFAULT_COLOR = "Unpainted";
		public Car(String initColor) {
			this.color = initColor;
		}
		public String toString() {
			return "Car color is " + this.color;
		}
	}

	public static class Truck extends Car {
		public int truckCapacity; //Unit: lbs; Default value = 0

		public Truck(String initColor, int initCapacity) {
			super(initColor); //Super must be first line in constructor
			this.truckCapacity = initCapacity;
		}
		public Truck() {
			super(Car.DEFAULT_COLOR);

		}

		// @Override // Annotation is used to give compiler more info abt code
		public String toFooString() { //Redifining method aka override — only do this for methods; NOT VAR
			return "Truck color is " + this.color + "\n" +
				"Truck capacity is " + this.truckCapacity;
		}
	}
}
