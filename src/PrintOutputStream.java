import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintOutputStream {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream file = new PrintStream("H:\\backtojava\\logs.txt");

        PrintStream console = System.out;

        System.setOut(file);
        System.out.println("Please find this line in text file");

        System.setOut(console);
        System.out.println("Hi Kiran !!!");


    }
}
