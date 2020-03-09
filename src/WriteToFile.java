import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {

            FileWriter myObj = new FileWriter("/data/Enhancements/CreateFile.txt");
            myObj.write("This is the first line in the file");
            myObj.close();
            System.out.println("File writing is completed successfully");
        }
        catch (IOException e) {

            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }
}
