public class lesson5_CAFH {
	public static void main(String[] args) {
		MyFunctionHolder.printFancyName("ken");
		MyFunctionHolder2.printFancyName("ken");
	}

	public static class MyFunctionHolder {
		public static void printName() {
			System.out.println("kénñ¥");
		}

		public static void printFancyName(String name) {
			System.out.println(name);
		}

		public static void printFancyFancyName(String firstName, String lastName, Integer fav_num) {
			System.out.println(firstName + " " + lastName + " likes " + fav_num);
		}

	}

	public static class MyFunctionHolder2 {
		public static void printFancyName(String name) {
			System.out.println(name);
		}
	}
}