import java.io.*;
public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// BufferedReader bReader = null;
		// try {
		// 	bReader = new BufferedReader(new FileReader("/Users/kenny/java-learn/basics/Lesson5_CAFH.java"));
		// 	String output = bReader.readLine();
		// 	while (output != null) {
		// 		System.out.println(output);
		// 		output = bReader.readLine();
		// 	}
		// } finally {
		// 	if (bReader != null) {
		// 		bReader.close();
		// 	}
		// }



		// try (BufferedReader bReader = new BufferedReader(new FileReader(args[0]))) {
		// 	String output = bReader.readLine();
		// 	while (output != null) {
		// 		System.out.println(output);
		// 		output = bReader.readLine();
		// 	}
		// }


		for(int i = 0; i < args.length; i++) {
			try (BufferedReader bReader = new BufferedReader(new FileReader(args[i]))) {
				String output = null;
				do {
					output = bReader.readLine();
					if(output != null) {
						System.out.println(output);
					}
				} while (output != null);
			}
		}

	}
}
