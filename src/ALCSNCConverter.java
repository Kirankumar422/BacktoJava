//import java.io.*;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.apache.poi.xssf.streaming.*;
//import java.lang.String;
//
//import static java.lang.Math.*;
//
//public class ALCSNCConverter {
//
//    public static void main(String[] args) throws Exception {
//
//        File file = new File("H:\\Office\\OneDrive\\OneDrive - NMSWorks Software Private Limited" +
//                "\\Documents\\AIRTEL\\ALU-OTN\\Dump\\connections.txt");
//        OutputStream fileout = new FileOutputStream("H:\\Office\\OneDrive\\" +
//                "OneDrive - NMSWorks Software Private Limited\\JavaOutputs\\alu_otn_snc.xlsx");
//        SXSSFWorkbook wb = new SXSSFWorkbook();
//        SXSSFSheet sheet1 = wb.createSheet("Connections");
//        SXSSFSheet sheet2 = wb.createSheet("RouteData");
//        SXSSFRow rowhead1 = sheet1.createRow((short) 0);
//        SXSSFRow rowhead2 = sheet2.createRow((short) 0);
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//        List<String> temp = new ArrayList<>();
//        while ((st = br.readLine()) != null) {
//            temp.add(st);
//        }
//
//        String[] str = new String[temp.size()];
//
//        for (int j = 0; j < temp.size(); j++) {
//            str[j] = temp.get(j);
//        }
//
//        {
//            LinkedHashSet<String> distinctColProp = new LinkedHashSet<>();
//
//            for (int i = 0; i < str.length; i++) {
//                String[] strSplitConnData = str[i].split("\\{\"connectionData\" : \\[\\{   ");
//                String[] strSplitComma = strSplitConnData[i].split(",");
//                for (int j = 0; j < strSplitComma.length; j++) {
//                    String[] strSplitColon = strSplitComma[j].split(":");
//                    distinctColProp.add(strSplitColon[0]);
//                }
//            }
//
//            int colcount = 0;
//
//            for (String s : distinctColProp) {
//                rowhead1.createCell(colcount).setCellValue(s);
//                colcount++;
//            }
//
//            int rowcount = 1;
//
//            String[] strSplitConnData = str[0].split("\\\\{\\\"connectionData\\\" : \\\\[\\\\{   ");
//            for (int i = 1; i < strSplitConnData.length; i++) {
//                String[] strSplitComma = strSplitConnData[i].split(",");
//                SXSSFRow row = sheet1.createRow(rowcount);
//                System.out.println(i);
//                int colCountCell = 0;
//                for (String s: distinctColProp) {
//                    int flag = 0;
//                    for (int j = 0; j < strSplitComma.length; j++) {
//                        String[] strSplitColon;
//                        strSplitColon = strSplitComma[j].split(":");
//                        if (strSplitColon[0].equals((s))) {
//                            flag = 1;
//                            if (s.contains("\"routeData\"")) {
//                                int startIndex = strSplitConnData[i].indexOf("\"routeData\"");
//                                int endIndex = strSplitConnData[i].indexOf("\\\"routeConstraints\\\"");
//                                String newStr = strSplitConnData[i].substring(startIndex, endIndex);
//                                String newSubStr = newStr.substring(newStr.indexOf('['), newStr.indexOf("],") + 1);
//                                if (newSubStr.length() > 2) {
//                                    newSubStr = newSubStr.substring(2, min(newSubStr.length() - 3, 300));
//                                }
//                                row.createCell(colCountCell).setCellValue(newSubStr);
//                            } else {
//                                row.createCell(colCountCell).setCellValue(strSplitColon[1]);
//                            }
//                        }
//                        if (flag == 0) {
//                            row.createCell(colCountCell).setCellValue(" ");
//                        }
//                    }
//                    colCountCell = colCountCell + 1;
//                }
//                rowcount = rowcount + 1;
//        }
//
//        }
//
//        {
//            LinkedHashSet<String> distinctRouteColumnNames = new LinkedHashSet<>(); {
//                String[] strSplitTempData = str[0].split("\"routeData\" : \\[\\{");
//                String strSplitRouteDataTemp = strSplitTempData[1].substring(strSplitTempData[1].indexOf("\"SERVERID\""))
//            , strSplitTempData[1].indexOf("} ]");
//                String strSplitRouteComma[] = strSplitRouteDataTemp.split(", ");
//                for (int i = 0; i < strSplitRouteComma.length; i++) {
//                    String[] strSplitRouteColon = strSplitRouteComma[i].split(":");
//                    distinctRouteColumnNames.add("\"CONNECTIONID\"");
//                    distinctRouteColumnNames.add(strSplitRouteColon[0]);
//                }
//                int colCount = 0;
//
//                for (String s : distinctRouteColumnNames) {
//                    rowhead2.createCell(colCount).setCellValue(s);
//                    colCount++;
//                }
//
//                int rowCount = 0;
//
//                int c = 0;
//
//                String[] strSplitConnData = str[0].split("\\{\"connectionData\" : \\[\\{   ");
//                for (int i = 0; i < strSplitConnData.length; i++) {
//
//                    String subConnectionId = strSplitConnData[i].substring(strSplitConnData[i].indexOf("\"CONNECTIONID\""),
//                            strSplitConnData[i].indexOf(" "));
//                    String[] strSplitConnIdValue = subConnectionId.split(":");
//
//                    int startIndex = strSplitConnData[i].indexOf("\"routeData\"");
//                    int endIndex = strSplitConnData[i].indexOf("\"routeConstraints\"");
//                    String newStr = strSplitConnData[i].substring(startIndex, endIndex);
//                    String newSubstr = newStr.substring(newStr.indexOf("["), newStr.indexOf("],") + 1);
//
//                    if (newSubstr.length() > 2) {
//
//                        List<String> data = SplitDataByCurlyBraces(newSubstr);
//
//                        for (int k = 0; k < data.size(); k++) {
//                            int columnCountCell = 0;
//                            c++;
//                            System.out.println(c);
//                            SXSSFRow row = sheet2.createRow(rowCount);
//                            row.createCell(columnCountCell).setCellValue(strSplitConnIdValue[1]);
//                            columnCountCell++;
//                            List<String> strSplitComma
//                        }
//                    }
//                }
//        }
//        }
//
//    }
//
//}
