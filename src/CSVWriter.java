import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class CSVWriter {

    public static void main(String[] args) throws Exception{

        try {

            FileInputStream fstream = new FileInputStream("H:\\Office\\OneDrive\\" +
                    "NMSWorks Software Private Limited\\Solutions - Documents\\AIRTEL\\CienaL0_SuperCollector\\notif.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            ArrayList list = new ArrayList();
            while ((strLine = br.readLine())!=null) {

                list.add(strLine);

            }
            String Alarmid = "", resourceid = "", nativeCondType = "";
            System.out.println("Executed successfully");

            Iterator itr;

            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sh = wb.createSheet("Sheet1");
            HSSFRow rowhead = sh.createRow((short)0);
            rowhead.createCell((short) 0).setCellValue("AlarmId");
            rowhead.createCell((short) 1).setCellValue("resourceId");
            rowhead.createCell((short) 2).setCellValue("nativeCondType");
            System.out.println("Executed successfully1");

            int index = 1;
            for (itr=list.iterator();itr.hasNext();) {

                String str = itr.next().toString();
                boolean reqstr = str.contains("Trying to convert");
                String [] splitSt = str.split(",");
                System.out.println("Executed successfully");
                for (int i = 0;i < splitSt.length; i++) {

                    Alarmid = splitSt[0];
                    resourceid = splitSt[1];
                    nativeCondType = splitSt[2];
                }
                HSSFRow row = sh.createRow((short) index);
                row.createCell((short) 0).setCellValue(Alarmid);
                row.createCell((short) 1).setCellValue(resourceid);
                row.createCell((short) 2).setCellValue(nativeCondType);
                index++;
            }
            FileOutputStream fileout = new FileOutputStream("H:\\Office\\OneDrive\\" +
                    "NMSWorks Software Private Limited\\Solutions - Documents\\AIRTEL\\CienaL0_SuperCollector\\");
            wb.write(fileout);
            fileout.close();
            System.out.println("Data saved in the excel");
        }

        catch (Exception e) {

            System.out.println(e);
        }
    }
}
