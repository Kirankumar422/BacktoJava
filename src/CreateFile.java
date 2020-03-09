import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {

            File myObj = new File("/data/Enhancements/CreateFile.txt");
            if (myObj.createNewFile())
                System.out.println("File Created: " + myObj.getName());
            else
                System.out.println("File already Exists, pls give another name");
        }
        catch (IOException e) {

            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}
