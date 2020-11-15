// CTD STANDS FOR CLASS TYPE DEFINITION
// DON'T USE STATIC ON METHODS WHEN CREATING TYPES
public class Lesson7_CTD {
	public static void main(String[] args) {
		Car hondaAccord = new Car("Red");
		// System.out.println(hondaAccord.color);
		hondaAccord.changeColor("ORANGE");
		// System.out.println(hondaAccord.color);

		Car hondaOdyssey = new Car("Grey");
		// System.out.println(hondaOdyssey.color);
		hondaOdyssey.changeColor("NEON PINK");
		// System.out.println(hondaOdyssey.color);
		// System.out.println(hondaOdyssey.toString());
		System.out.println(hondaOdyssey);
	}

	public static class Car {
		public String color;
		public Car(String initColor) {
			this.color = initColor;
		}
		public void changeColor(String color) {
			this.color = color;
		}
		// public String toString() {
		// 	return "Car color = " + this.color;
		// }
	}
}

// EXERCISE: CREATE CLASS NAMED POINT WITH 2 INT VARS: X AND Y
// EXERCISE: CREATE ADD METHOD; TAKES ARGS OF POINT AND ADDS TO INSTANCE POINT
// EXERCISE: CREATE 10,000 RANDOM POINTS IN ARRAY(-100 to 100)