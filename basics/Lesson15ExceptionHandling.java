// Unchecked exception: Any exception that extends RuntimeException; can be used anywhere with/without try/catch
// Checked exception: Any exception that extends Exception; must be declared on signature with "throws"; has to be called within a try/catch

public class Lesson15ExceptionHandling {
	public static void main(String[] args) {
		try {
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			System.out.println(a / b);
		} catch(ArithmeticException | NumberFormatException arithmeticErr) {
			System.out.println("WRONG INPUT");
		} catch(Exception exceptionErr) { // Not doing anything with exception catching is called "Swallowing," don't do this!
			// System.out.println("Something Broke!");
			// System.out.println(err.getStackTrace());
			// err.printStackTrace();
			// System.out.println(exceptionErr.getClass().getName());
		} finally {
			System.out.println("Thank you for using our services");
		}


		// testDivision();
	}

	public static void testDivision() {
		divide(100, 0);
	}
	public static void testDivision2() {
		try {
			divide2(100, 0);
		} catch(BadBadException badbad) {

		}
	}
	public static void testDivision3() throws BadBadException {
		divide2(100, 0);
	}

	public static int divide(int int1, int int2) { // CHECKED EXCEPTION(EXTENDS RUNTIME)
		if (int2 == 0) {
			throw new BadNumberException("Invalid argument: " + int2);
		}
		return int1 / int2;
	}
	public static int divide2(int int1, int int2) throws BadBadException {
		if(int2 == 0) {
			throw new BadBadException("Invalid argument: " + int2);
		}
		return int1 / int2;
	}

	public static class BadNumberException extends RuntimeException{  // UNCHECKED EXCEPTION(EXTENDS EXCEPTION)
		public BadNumberException(String message) {
			super(message);
		}
	}

	public static class BadBadException extends Exception {
		public BadBadException(String message) {
			super(message);
		}
	}
}
