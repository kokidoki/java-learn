import lesson9.*;
public class Lesson9AccessModifier {
	public static void main(String[] args) {
		Car chippie = new Car("Green");
		// System.out.println(chippie.getColor());
		// System.out.println(chippie.color_);
		chippie.setColor("pink");
		// System.out.println(chippie.getColor());
		// System.out.println(chippie.price);

		Truck chip = new Truck(1000000.99);
		// System.out.println(chip.price);
		System.out.println(chip.getTruckPrice());
	}
}




//METANOTE(INFO ON INFO; NOTES ON NOTES)
//NOTE ARE IN PACKAGE CAR.java