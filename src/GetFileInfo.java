import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {

        File myObj = new File("/data/Enhancements/CreateFile.txt");
        if (myObj.exists()) {

            System.out.println("File Name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in " + myObj.length() + " bytes");
        }
        else
            System.out.println("The file doesn't exit");
    }
}
