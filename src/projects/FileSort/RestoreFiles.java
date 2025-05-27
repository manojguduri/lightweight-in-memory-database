package projects.FileSort;

import java.io.File;

public class RestoreFiles {
    public static void main(String[] args) {
        String dir = "D:\\Testfolder";
        File directory = new File(dir);
        File[] folders = directory.listFiles(File::isDirectory);
        for (File folder: folders){
            File[] files = folder.listFiles(File::isFile);
            for(File file : files){
                moveToHomeDirectory(file,dir);
            }
        }
        System.out.println("All files are moved to home directory");
    }

    private static void moveToHomeDirectory(File file, String dir) {
        File destination = new File(dir, file.getName());
        boolean success = file.renameTo(destination);
        if(!success){
            System.out.println("The file could not be moved");
        }
    }
}
