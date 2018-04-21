package ca.rjdsilv;

import java.io.File;
import java.util.Objects;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("######################################################## Scripts");
		File folder = new File("C:\\Users\\rjdsi\\GitHub\\COMP-305\\COMP305_FinalProject\\Assets\\Scripts");
		listFilesForFolder(folder, ".cs");

		System.out.println("\n######################################################## Scriptable Objects");
		folder = new File("C:\\Users\\rjdsi\\GitHub\\COMP-305\\COMP305_FinalProject\\Assets\\ScriptableObjects");
		listFilesForFolder(folder, ".asset");

		System.out.println("\n######################################################## Sound Index");
		folder = new File("C:\\Users\\rjdsi\\GitHub\\COMP-305\\COMP305_FinalProject\\Assets\\Sounds");
		listFilesForFolder(folder, ".mp3");
		listFilesForFolder(folder, ".ogg");
		listFilesForFolder(folder, ".wav");
	}

	private static void listFilesForFolder(final File folder, String extension) throws Exception {
		for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry, extension);
			} else {
				String filePath = fileEntry.getCanonicalPath();
				if (filePath.endsWith(extension)) {
					System.out.println(filePath.substring(filePath.indexOf("Assets")));
				}
			}
		}
	}
}
