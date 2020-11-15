public class Lesson4_functions {
	public static void main(String[] args) {
		//JAVA HAS NO FUNCTIONS — ONLY METHODS(METHODS ARE ALWAYS INSIDE CLASS)


		// printName();
		// printFancyName("kennì");
		// printFancyName("¬î¬¥");
		// printFanc
		// vacuum("k"yFancyName("kenn", "den", 3);
		// printFancyFancyName("lil", "den", 78);
		// walk(15);
		// vacuum(););
		// vacuum("k", "e", "m", "n", "y");
		System.out.println(sum(1, 1));
		System.out.println(sum(1.0, 2.0));

	}
	public static void printName() {
		System.out.println("kénñ¥");
	}
	public static void printFancyName(String name) {
		System.out.println(name);
	}
	public static void printFancyFancyName(String firstName, String lastName, Integer fav_num) {
		System.out.println(firstName + " " + lastName + " likes " + fav_num);
	}
	public static void walk(Integer step) {
		if (step > 0) {
			System.out.println("Step number " + step);
			walk(--step);
		}
	}
	public static void vacuum(String ...bag) {
		for (String dust : bag) {
			System.out.print(dust);
		}
	}

	// METHOD OVERLOADING — loading same name with different arg type
	// Method Signature = Uniqueness(Return type, name, argument name)(Ex: Integer, Sum, Integer)
	public static Integer sum(Integer a, Integer b) {
		return a + b;
	}
	public static Double sum(Double a, Double b) {
		return a + b;
	}


	// EXERCISE: WRITE METHOD TO TAKE ARRAY AND PRINT VALUES(Should be printed like ArrayList)
	// EXERCISE: WRITE METHOD TO SHUFFLE AN ARRAY(Math.random() needed)
	// EXERCISE: WRITE METHOD TO PRINT FIBONACCI SEQUENCE UP TO MAX VALUE
}