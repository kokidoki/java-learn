import java.util.*;
public class Lesson2b_collectionTypes {
	public static void main(String[] args) {
		//Array is ordered, hash is unordered — uses key/value

		// ARRAYLIST
		ArrayList<Integer> a = new ArrayList<>(); // type in "< >" is called generic type, defines what types can be put into wrapper
		//WILL NOT WORK; int is not a wrapper type
		// ArrayList<int> a = new ArrayList<>();

		a.add(123);
		// System.out.println(a.get(0));

		ArrayList<String> s = new ArrayList<>();
		s.add("dfkj");
		s.add("peach");
		s.add("strawberry");
		// System.out.println(s);
		s.remove(2);
		// System.out.println(s);
		// System.out.println(s.size());
		s.set(0, "orangwe");
		// System.out.println(s);


		//MAP
		HashMap<String, Integer> hasma = new HashMap<>();
		hasma.put("arg1", 3483);
		hasma.put("arg2", 37483);
		hasma.put("arg3", 33483);
		// System.out.println(hasma);
		hasma.put("arg3", 9);
		// System.out.println(hasma);
		hasma.remove("arg3");
		// System.out.println(hasma.size());
		hasma.put(null, 83578245); //Don't use null as key
		// System.out.println(hasma);
		// System.out.println(hasma.get("arg1"));
		// System.out.println(hasma.get(null));
		// System.out.println(hasma.containsKey("arg2"));
		// System.out.println(hasma.containsKey("årg2"));




		ArrayList<String> names = new ArrayList<>(List.of("kenni", "lilli", "daddi"));
		// System.out.println(names);

		names.clear();
		// System.out.println(names);



		HashMap<String, Integer> family = new HashMap<>(Map.of("Kenny", 13, "Lily", 10, "Dad", 100));
		// System.out.println(family);
		family.clear();
		// System.out.println(family);



		List<Integer> b = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		// System.out.println(b.size());
		Map<String, Integer> c = new HashMap<>(Map.of("Foo", 88522, "Bar", 495261));
		// System.out.println(c.size());
		// printList(b);
		List<Integer> d = List.of(1, 2, 3);
		// d.add(99);
		b.add(99);
		// printList(d);

		for (String k : c.keySet()) {
			// System.out.println(k);
		}
		Set<String> keys = c.keySet(); // Sets are like array, but cannot have repeating items
		// System.out.println(keys);

		Set<String> myset = new HashSet<>();
		myset.add("a");
		myset.add("b");
		myset.add("c");
		myset.add("b");
		myset.add("b");
		myset.add("b");
		// System.out.println(myset);
		// System.out.println(new ArrayList<String>(myset).get(0)); // Order of items in Set is not guarenteed


		Set<Map.Entry<String, Integer>> entrySet = c.entrySet();
		// System.out.println(entrySet);
		for (Map.Entry<String, Integer> valuePair : entrySet) {
			System.out.println(valuePair.getKey() + " " + valuePair.getValue());
		}
	}

	public static void printList(List<Integer> list1) {
		System.out.println("List Type: " + list1.getClass());
		for (Integer i : list1) {
			System.out.println(i);
		}
	}
}
