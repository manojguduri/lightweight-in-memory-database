package projects.FileSort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOrganizerService {
    private final File directory;

    public FileOrganizerService(String dirPath) throws IOException{
        directory = new File(dirPath);
        if(!directory.isDirectory() || !directory.exists()){
            throw new IOException("Invalid directory path.");
        }
    }

    public void sortBy(String criteria) throws IOException{
        File[] files = directory.listFiles(File::isFile);
        if((files == null) || (files.length == 0)){
            throw new IOException("There are no files in the directory");
        }
        List<FileInfo> fileList = new ArrayList<>();
        for (File file : files){
            fileList.add(new FileInfo(file));
        }

        for(FileInfo fileInfo : fileList){
            String subDir;
            switch (criteria.toLowerCase()){
                case "extension":
                    subDir = fileInfo.getExtension();
                    break;
                case "size":
                    subDir = fileInfo.getSize();
                    break;
                case "date":
                    subDir = fileInfo.getDate();
                    break;
                default:
                    System.out.println("Select correct criteria and try again.");
                    return;
            }
            moveToSubDirectory(fileInfo.getFile(),subDir);
        }
        System.out.println("File are organized according to the "+criteria);
    }

    private void moveToSubDirectory(File file, String subDir) {
        File subDirectory = new File(directory, subDir);
        if(!subDirectory.exists()){
            subDirectory.mkdir();
        }
        File destination = new File(subDirectory, file.getName());
        boolean success = file.renameTo(destination);
        if(!success){
            System.out.println("The file could not be moved");
        }
    }
}
