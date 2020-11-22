/*
Creating a jar from all .class files in current dir: find <path> -name '*.class' | xargs jar -cvf <jar name>
Running main file in jar: java -cp <jar name> <main class to run>
Listing files in jar: jar -tvf <jar name>

To clean directory, pipe all .class files into xargs and rm -v
ALWAYS SAVE AND PUSH BEFORE DELETING
*/
import lesson19.*;
public class Lesson19JarFile {
	public static void main(String[] args) {
		Main.main(args);
	}
}
