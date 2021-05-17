import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class txtCSV_Selective {

    public static void main(String[] args) throws Exception{

        File file = new File("H:\\Office\\OneDrive\\NMSWorks Software Private Limited\\" +
                "Solutions - Documents\\AIRTEL\\CienaL0_SuperCollector\\notif.txt");
        OutputStream fileOut = new FileOutputStream("H:\\Office\\OneDrive\\" +
                "NMSWorks Software Private Limited\\Solutions - Documents\\AIRTEL\\" +
                "CienaL0_SuperCollector\\txtCSV_Selective.csv");
        Workbook wb = new HSSFWorkbook();
        Sheet sh = wb.createSheet("Sheet1");
        Row rowHead = sh.createRow((short)0);
        rowHead.createCell(0).setCellValue("alarmId");
        rowHead.createCell(1).setCellValue("resourceId");
        rowHead.createCell(2).setCellValue("nativeCondType");

        System.out.println("File Reading Started");
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("File Reading Completed");

        String st;
        List<String> temp = new ArrayList<>();

        while ((st = br.readLine()) != null) {

            if (st.contains("Trying to convert")) {
                temp.add(st);
            }
        }
        String[] str = new String[temp.size()];

        for (int j = 0; j < temp.size(); j++) {
            str[j] = temp.get(j);
        }

        int rc = 1;


        System.out.println("File Writing Started");

        for (String s : str) {
            Row row = sh.createRow((short) rc);
            String[] strSplitComma = s.split(",");

            for (String value : strSplitComma) {
                String[] strSplitEquals = value.split("=");

                for (int k = 0; k < strSplitEquals.length - 1; k++) {

                    switch (strSplitEquals[k]) {
                        case "alarmId":
                            row.createCell(0).setCellValue(strSplitEquals[k + 1]);
                            break;
                        case "resourceId":
                            row.createCell(1).setCellValue(strSplitEquals[k + 1]);
                            break;
                        case "nativeCondType":
                            row.createCell(2).setCellValue(strSplitEquals[k + 1]);
                            rc = rc + 1;
                            break;
                    }
                }
            }
        }
        System.out.println("File written Completed");
        wb.write(fileOut);
        fileOut.close();
        wb.close();
    }
}
