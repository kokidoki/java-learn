import java.util.*;
public class lesson2b_collectionTypes {
	public static void main(String[] args) {
		//Array is ordered, hash is unordered — uses key/value

		// ARRAYLIST
		ArrayList<Integer> a = new ArrayList<>();
		//WILL NOT WORK; int is not a wrapper type
		ArrayList<int> a = new ArrayList<>();

		a.add(123);
		System.out.println(a.get(0));

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
	}
}