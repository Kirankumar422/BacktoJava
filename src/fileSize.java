import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileSize {

    public static void main(String[] args) {

        String fileName = "H:\\Office\\OneDrive\\OneDrive - NMSWorks Software Private Limited\\Documents\\SEACOM\\Infinera" +
                "\\Dumps\\CSV\\ProvisioningResourceData.xlsx";
        getFileSize(fileName);
    }

    public static void getFileSize(String fileName) {

        Path path = Paths.get(fileName);

        try {

            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d KB", bytes / 1024));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
