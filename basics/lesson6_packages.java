//DON'T FORGET TO COMPILE PACKAGE FILES
import lesson6.Strawberry;
import lesson6.drinks.*;
public class Lesson6_packages {
	public static void main(String[] args) {
		System.out.println("Hello World");

		// lesson6.Strawberry.washFruit();
		// lesson6.drinks.Water.drink();
		lesson6.drinks.Strawberry.washFruit();
		Strawberry.washFruit();
		// Water.drink();
	}
}