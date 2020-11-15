// ACCESS MODIFIERS CONTROL WHO CAN ACCESS CLASSES/METHODS/MEMBER VARS
// Default class always extends Object Class
package lesson9;
public class Car extends Object {

	// public String color;
	private String color; //PRIVATE CAN'T BE ACCESSED OUTSIDE OF CLASS
	private int myPrivateSecretFavoriteUntouchableCamelCaseNumber;
	// private double price;
	protected double price; //PROTECTED VARS CAN BE ACCESSED THROUGH INHERITANCE; PRIVATE IS PRIVATE
	boolean forSale; //DEFAULT ACCESS MODIFIER — same as protected, except packages can access too; aka package modifier


	public Car(String color) {
		this.color = color;
	}

	@Override 
	public String toString() {
		return "Car color = " + this.color;
	}


	//GETTER/SETTER

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getMyPrivateSecretFavoriteUntouchableCamelCaseNumber() {
		return this.myPrivateSecretFavoriteUntouchableCamelCaseNumber;
	}

	public void setMyPrivateSecretFavoriteUntouchableCamelCaseNumber(int myPrivateSecretFavoriteUntouchableCamelCaseNumber) {
		this.myPrivateSecretFavoriteUntouchableCamelCaseNumber = myPrivateSecretFavoriteUntouchableCamelCaseNumber;
	}


	public double getPrice() {
		return this.price;
	}
}