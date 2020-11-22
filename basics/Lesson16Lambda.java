import java.util.*;
import java.util.stream.*;
public class Lesson16Lambda {
	public static void main(String[] args) {
		// Runnable task = new Runnable() {
		// 	public void run() {
		// 		System.out.println("Runnig");
		// 	}
		// };
		// task.run();

		// Runnable task = () -> {
		// 	System.out.println("Runnig");
		// };
		// Runnable task = () -> System.out.println("Runnig");
		// task.run();

		// doAction(() -> {
		// 	System.out.println("I'm a robot!");
		// 	System.out.println("I'm working on a secret mission to conquer the world using java");
		// });

		// Object x = () -> System.out.println("Runnig");
		// System.out.println(x.getClass());

		// ArrayList<Integer> intlist = new ArrayList<>(List.of(1, 3, 6, 984, 496, 78));
		// Comparator<Integer> compare = (Integer a, Integer b) -> {
		// 	return b - a;
		// };
		// Collections.sort(intlist, compare);
		// System.out.println(intlist);

		// ArrayList<Integer> intlist = new ArrayList<>(List.of(1, 3, 6, 984, 496, 78));
		// Collections.sort(intlist, (a, b) -> b - a);
		// System.out.println(intlist);
		ArrayList<String> strList = new ArrayList<>(List.of("foo", "bar", "test"));
		// for (String str : strList) {
		// 	System.out.println(str.toUpperCase());
		// }
		// strList.stream().forEach((String i) -> System.out.println(i.toUpperCase()));
		List<String> capList = (strList.stream().map((i) -> i.toUpperCase())).collect(Collectors.toList());
		System.out.println(capList);
	}

	public static void doAction(Runnable task) {
		task.run();
	}
}
