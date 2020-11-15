import java.util.*;
// import Lesson10ENumType.Color.*;
public class Lesson10ENumType {
	public static void main(String[] args) {
		// System.out.println(Color.BLUE);
		Color brush = Color.GREEN;
		// System.out.println(brush);

		// System.out.println(brush.ordinal());
		// System.out.println(brush.name());
		Color roller = Color.valueOf("YELLOW");
		// System.out.println(roller);



		for (Color color : Color.values()) {
			// System.out.println(color);
		}

		if (roller == Color.YELLOW) {
			// System.out.println("Yellow paint applied");
		}


		String sColor = "Yellow";
		if (sColor.equals("Yellow")) {
			// System.out.println(sColor);
		}

		// Car test = new Car("Pkatinum");
		// System.out.println(test.color);

		// Car test = new Car(Color.BLUE);
		// System.out.println(test.color);

		// Car test = new Car(Color.valueOf("BLUEx"));
		// System.out.println(test.color);


		// try {
		// 	Color brush2 = Color.valueOf("YELLOWx");
		// } catch (IllegalArgumentException err) { // Called "Runtime Exception"
		// 	System.out.println(err);
		// }

		HashMap<Color, String> map = new HashMap<>(Map.of(Color.BLUE, "sldfjsd", Color.YELLOW, "9028375"));
		// HashMap<Color, String> map = new HashMap<>(Map.of(BLUE, "sldfjsd", YELLOW, "9028375")); //CAN DO WITH COLOR AS SEPERATE PACKAGE
		System.out.println(map);
	}

	public static enum Color {
		BLUE, GREEN, YELLOW;
	}

	// public static class Car {
	// 	public String color;
	// 	public Car(String color) {
	// 		this.color = color;
	// 	}
	// }

	public static class Car {
		public Color color;
		public Car(Color color) {

			this.color = color;
		}
	}
}