import java.io.File;
public class ListDirectory {
	public static void main(String[] args) {
		File cabinet = new File(args[0]); // File can represent files or directories
		System.out.println("File exists? " + cabinet.exists());
		System.out.println("Is file? " + cabinet.isFile());
		System.out.println("Is directory? " + cabinet.isDirectory());
		if (cabinet.isDirectory()) {
			File[] fileList = cabinet.listFiles();
			for (File file : fileList) {
				System.out.println(file.getName());
			}
		}
	}
}
