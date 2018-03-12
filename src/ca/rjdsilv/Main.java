package ca.rjdsilv;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
	    File folder = new File("C:\\Users\\rjdsi\\GitHub\\COMP-305\\COMP305_FinalProject\\Assets\\Scripts");
        listFilesForFolder(folder);
    }

    private static void listFilesForFolder(final File folder) throws Exception {
        if (null != folder) {
            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {
                    listFilesForFolder(fileEntry);
                } else {
                    String filePath = fileEntry.getCanonicalPath();
                    if (filePath.endsWith(".cs")) {
                        System.out.println(filePath.substring(filePath.indexOf("Scripts")));
                    }
                }
            }
        }
    }
}
