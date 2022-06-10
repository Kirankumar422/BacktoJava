import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class excelFileRead {
    
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File("H:\\Office\\OneDrive\\" +
                "OneDrive - NMSWorks Software Private Limited\\Documents\\AIRTEL\\Report-Requirement\\" +
                "OMS_PARENTPORTLABELS.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        Iterator<Row> itr = sheet.iterator();
        while (itr.hasNext()) {

            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t\t");
                        break;
                    default:
                }
            }
            System.out.println("");
        }
    }
}
