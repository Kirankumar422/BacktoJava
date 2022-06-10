import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class txtToCSV {

    public static void main(String[] args)  throws IOException{

        List<String[]> csvData = createCSVData();

        // default all fields ar enclosed in double quotes
        // default separator is a comma
        try (CSVWriter writer = new CSVWriter(new FileWriter("H:\\Office\\OneDrive" +
                "\\NMSWorks Software Private Limited\\Solutions - Documents\\AIRTEL" +
                "\\CienaL0_SuperCollector\\output.csv"))) {
            writer.writeAll(csvData);
        }
    }

    private static List<String[]> createCSVData() {

        String[] header = {"id", "name", "phone"};
        String[] record1 = {"10000", "Kiran", "9492659296"};

        List<String[]> list = new ArrayList<>();
        list.add(header);
        list.add(record1);

        return list;
    }

    }

