import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        try {

            File myObj = new File("/data/Enhancements/CreateFile.txt");
            Scanner myScanner = new Scanner(myObj);
            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
            myScanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
