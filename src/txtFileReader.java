import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class txtFileReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fstream = new FileInputStream("H:\\Office\\OneDrive\\" +
                "NMSWorks Software Private Limited\\Solutions - Documents\\AIRTEL" +
                "\\CienaL0_SuperCollector\\notif.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        ArrayList list = new ArrayList();
        while ((strLine = br.readLine())!=null) {

            list.add(strLine);
            if (strLine.contains("Trying to convert")) {

                //System.out.println(list.stream().findFirst("alarmId"));

                Iterator itr;

//                HSSFWorkbook wb = new HSSFWorkbook();
//                HSSFSheet sh = wb.createSheet("data");
//                HSSFRow rowhead = sh.createRow((short) 0);
//                rowhead.createCell((short) 0).setCellValue("alarmId");
//                rowhead.createCell((short) 1).setCellValue("resourceId");
//                rowhead.createCell((short) 2).setCellValue("nativeCondType");

//                int index = 1;
//
//                for (itr=list.iterator(); itr.hasNext();) {
//
//                    String str = itr.next().toString();
//                    String[] splitst = str.split(",");
//                    System.out.println(splitst.length);
//                    for (int i = 0; i < splitst.length; i++) {
//
//                        String AlarmId = splitst[1];
//                        System.out.println(AlarmId);
//                    }
//                }

            }



        }
    }
}
