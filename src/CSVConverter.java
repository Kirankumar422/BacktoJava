import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CSVConverter {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {

        ArrayList<ArrayList<String>> allRowAndColData;
        ArrayList<String> oneRowData;
        String fname = "H:\\\\Office\\\\OneDrive\\\\\" +\n" +
                "\"NMSWorks Software Private Limited\\\\Solutions - Documents\\\\AIRTEL\" +\n" +
                "\"\\\\CienaL0_SuperCollector\\\\notif.txt";
        String currentLine;
        FileInputStream fis = new FileInputStream(fname);
        DataInputStream myInput = new DataInputStream(fis);
        allRowAndColData = new ArrayList<>();
        while ((currentLine = myInput.readLine()) != null) {

            oneRowData = new ArrayList<>();
            String[] oneRowArray = currentLine.split(",");
            Collections.addAll(oneRowData, oneRowArray);
            allRowAndColData.add(oneRowData);
            System.out.println();
        }

        try {

            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sh = wb.createSheet("sheet1");
            for (int m =0; m < allRowAndColData.size(); m++) {

                ArrayList<?> ardata = allRowAndColData.get(m);
                HSSFRow row = sh.createRow(m);
                for (int k = 0; k < ardata.size(); k++) {
                    System.out.println(ardata.get(k));
                    HSSFCell cell = row.createCell((short) k);
                    cell.setCellValue(ardata.get(k).toString());
                }
                System.out.println();
            }

            FileOutputStream fileOutputStream = new FileOutputStream("H:\\\\Office\\\\OneDrive\\\\\" +\n" +
                    "\"NMSWorks Software Private Limited\\\\Solutions - Documents\\\\AIRTEL\" +\n" +
                    "\"\\\\CienaL0_SuperCollector\\\\output.csv");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        }
        catch (Exception ignored) {
        }

    }
}
