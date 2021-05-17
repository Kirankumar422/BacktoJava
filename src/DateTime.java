import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        String dateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        System.out.println("Current Date and Time: " +dateTime);

    }
}
