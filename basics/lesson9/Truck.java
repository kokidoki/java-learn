package lesson9;
public class Truck extends Car {
	public Truck(double price) {
		super("White");
		this.price = price;
	}

	public double getTruckPrice() {
		return this.price * 2;
	}
}