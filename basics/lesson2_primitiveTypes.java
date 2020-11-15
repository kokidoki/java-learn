public class lesson2_primitiveTypes {
	public static void main(String[] args) {
		int i = 8386;
		// System.out.println(1 + (2 - 3) * 4 / 5);

		double d = 3.141592653589793238462643383279502;
		// System.out.println(1.1 + 2.2 - 3.3 * 4.4 / 5.5);
		// System.out.println(0.1 + 0.2);

		boolean b = true;
		// System.out.println(b);

		// String s = "Hello ABC anything kenny";
		// String s = "";
		// String s = null;
		// System.out.println(s);

		float f = 0.5656f;
		// System.out.println(f);

		long l = 20375908372450928l;

		short s = 32000;
		// System.out.println(s);

		byte by = -128;
		// System.out.println(by);

		// char c = 'z';
		char c = '9';
		// System.out.println(c);

		int[] intarray = {1, 5, 7, 3, 6, 4};
		// System.out.println(intarray[intarray.length - 1]);

		String[] strarray = {"k", "1", "2", "3"};
		// System.out.println(strarray[strarray.length - 1]);
		// System.out.println(strarray);
		// System.out.println(args.length);

		// int[] bigarray = new int[50000000000000000000000000000000000000000000000000];


		// WRAPPER TYPE
		// Each primitive type has a wrapper class with same name(except capitalized) that you can use to make objects
		Long lablab = new Long(978882541554l);
		System.out.println(lablab);

		long lakoocha = 978882541554l;
		System.out.println(lakoocha);

		System.out.println(lablab.toString());
		System.out.println(Long.MAX_VALUE);
	}
}

/*8 primitive types:

4 MAJOR TYPES
-int: integer; can do basic operations(add, subtract, multiply, divide)

-double: decimal; can go up to 15 decimal places; can also do same operations as above; 
binary can't represent certain numbers so it will round; for exact numbers(money) other type needs to be used

-boolean: boolean

-String: not primitive data type, is a class; null ≠ empty string(almost like value type); can be concatenated with other strings or integers

4 MINOR TYPES
-float: smaller version of double(smaller range); end with letter f or FS

-long: bigger version of int(higher range)

-short: smaller version of int(lower range)

-byte: smaller version of int(lower lower range)

-char: ONE CHARACTER(letter or number)*/






