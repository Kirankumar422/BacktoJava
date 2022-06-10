import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StringSplit {

    public static void main(String[] args) throws IOException {

        String st = "INFO [2021-03-27T16:30:24,379] CIENAMCPNotifClient$AlarmProcessor: run(): Sat Mar 27 16:30:24 " +
                "IST 2021 CIENA-OTN-NMS Trying to convert eventNotification : EventNotification{topic=" +
                "topics:bp.aeprocessor.v1.alarmcorrelation, event=shout, payload=Payload{status=ok, " +
                "body=Body{value=Value{version=1, header={envelopeId=4b85c13a-eaa5-4d92-95d3-2ab3adebd661, " +
                "timestamp=2021-03-27T11:00:23.732Z, traceId=e46c5981-1c7c-4df5-a072-6f12deb5bd70, " +
                "upstreamId=73a33493-3a29-4b19-bb1c-175db65e24d8}, event=Event{_type=bp.v1.alarmSuperseded, " +
                "alarm=Alarm{data=Data{id=-2282847700756700164, type=FilteredAlarm, " +
                "attributes=Attributes{id='-2282847700756700164', alarmId='-2282847700756700164', " +
                "nodeId='22c99806-c374-4586-ba63-0fffe48684b6', rawAlarmId='0200000000-0000-0000', " +
                "nodeType='6500', state='ACTIVE', resource='ETTP-2-3-2', resourceId='ETTP-2-3-2', " +
                "nativeCondType='T-UAS-E', conditionSeverity='INFO', nativeState='null', manualClearable='true'," +
                " clearTime='null', additionaltext='T-UAS-E', firstRaiseTime='2019-11-22T16:00:14.000Z', " +
                "lastRaiseTime='2021-03-27T11:00:14.000Z', noOfOccurence='37923', ackState='NOT_ACKNOWLEDGED', " +
                "deviceID='07aea285-5cb9-3a16-9dc6-bb45a3cb3b70', deviceName='MUZ_BLBR_NSC_D_C3336', " +
                "ipAddress='172.29.116.28', macAddress='74:87:BB:73:80:67', " +
                "additionalAttrs={Threshold Level=10, YEAR=2021, Time Period=15-MIN, " +
                "DGNTYPE=0200000000-0000-0000, MODE=NONE, aidtype=ETTP, Monitor Value=14, location=NEND, " +
                "source=6500:ETTP-2-3-2, CARDTYPE=WLAi MOTR | | 4xQSFP28, direction=RCV, Condition Effect=TC}, " +
                "affInvIds=[com.nmsworks.ms.bridge.ciena.mcp.data.EventNotification$AffectedInvIds@1c5a08c7]}}}}}}}}";
        String[] parts = st.split("EventNotification");
        String[] delimit = parts[1].split(",");
//        Workbook wb = new HSSFWorkbook();
//        Sheet sh = wb.createSheet("Sheet1");
//        OutputStream op = new FileOutputStream("H:\\Office\\OneDrive\\NMSWorks Software Private Limited" +
//                "\\Solutions - Documents\\AIRTEL\\CienaL0_SuperCollector\\convert.csv");

//        System.out.println(delimit.length);
        for (String s : delimit) {
//            System.out.println(delimit[i]);
            String[] str = s.split(",");
//            System.out.println(str[i]);
//            System.out.println(str[1]);
            for (int j = 0; j < str.length; j++) {
                String[] str1 = str[j].split("=", 2);
//                Row rowHead = sh.createRow((short) 0);
//                rowHead.createCell(j).setCellValue(str1[j]);
//                int r = 1;
//                Row row = sh.createRow((short) r);
//                row.createCell(r).setCellValue(str1[j + 1]);

                System.out.println(str1[j]);
                System.out.println(str1[j + 1]);
            }
        }
//        wb.write(op);
//        op.close();
//        wb.close();
    }
}
