package projects.FileSort;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {
    private File file;
    public FileInfo(File file){
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public String getExtension(){
        String name = file.getName();
        int lastDot = name.lastIndexOf('.');
        return lastDot == -1 ? "Unknown" : name.substring(lastDot+1).toLowerCase();
    }

    public String getDate(){
        long date = file.lastModified();
        String finaldate = new  SimpleDateFormat("dd-MM-yyyy").format(new Date(date));
        return finaldate;
    }

    public String getSize(){
        long size = file.length();
        if(size < 1024*1024){
            return "Small";
        } else if (size < 10*1024*1024) {
            return "Medium";
        }else return "Large";
    }
}
