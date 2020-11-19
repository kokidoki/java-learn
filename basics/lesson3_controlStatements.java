import java.util.*;

public class Lesson3_controlStatements {
	public static void main(String[] args) {
		//INCREMENT OPERATORS
		// All of these methods work on 4 basic operators(+, -, *, /)
		int a = 83;
		a = a + 1;
		a++;
		a = a + 5;
		a += 5;
		// System.out.println(a);

		//Pre/Post Increment
		int i = 9;
		int i2 = 7;
		int b = i++;
		int c = ++i2;
		// System.out.print(b);
		// System.out.print(i);
		// System.out.print(c);
		// System.out.print(i2);
		// System.out.println(b);
		// System.out.println(i);
		// System.out.println(c);
		// System.out.println(i2);



		//COMPARISON OPERATORS/BOOLEAN RESULTS
		int x = 1, y = 2;
		boolean result1 = x == y;
		// System.out.println(result1);
		// System.out.println(x == y);
		// System.out.println(x != y);
		// System.out.println(x > y);
		// System.out.println(x < y);
		// System.out.println(x <= y);
		// System.out.println(x >= y);
		// System.out.println(!result1);
		// System.out.println(!(x == y));


		//CONDINTIONAL BRANCHING(AKA IF STATEMENTS)
		// if (!(a == y)) {
		// 	System.out.println("I am a trhue");
		// } else {
		// 	System.out.println("I am a falsef");
		// }

		// STRING COMPARISON
		String foo = "bar";
		if (foo.equals("bar")) {
			System.out.println("Equal!");
		}


		//IF & ELSIF
		// if (!(a == y)) {
		// 	System.out.println("I am a trhue");
		// } else if (a > y) {
		// 	System.out.println("I am a falsef");
		// }


		//REPEATING STATEMENTS
		// for (int z = 0; z <= 10; z++) {
		// 	System.out.println(z);
		// }

		int[] bun = {1, 2, 5, 4, 5, 456, 7, 8910, 6445, 10};
		// for (int bunn = 0; bunn < bun.length; bunn++) {
		// 	System.out.println(bun[bunn]);
		// }

		// for (int bunni : bun) {
		// 	System.out.println(bunni);
		// }

		ArrayList<String> rabbit = new ArrayList<>();
		rabbit.add("Carrot");
		rabbit.add("Berries");
		rabbit.add("Lettuce");
		rabbit.add("BIG CARROT");
		// for (String food : rabbit) {
		// 	System.out.println(food);
		// }






		//WHILE LOOPS
		int counter = 0;
		// while (counter <= 10) {
		// 	System.out.println("a");
		// 	counter++;
		// }
		// while (counter < rabbit.size()) {
		// 	System.out.println(rabbit.get(counter));
		// 	counter++;
		// }


		//LOOPING A MAP
		HashMap<String, Integer> mappy = new HashMap<>();
		mappy.put("Strawberry", 10);
		mappy.put("Banana", 5);
		mappy.put("Peach", 10);
		mappy.put("Apple Pear", 2);
		mappy.put("Tomato", 1);

		for (String fruit : mappy.keySet()) {
			System.out.println(fruit + ":" + mappy.get(fruit));
		}
		//EXERCISE — Create HashMap with at least 3 elementsr and print all the elements using a for loop
		//EXERCISE — Print the alphabet in one line sperated by spaces
		//EXERCISE — Print 10 random strings that contain alphanumeric chars(12 long)

	}
}
