import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class fileRead {

    public static void main(String[] args) {

        File file = new File("H:\\Office\\OneDrive\\NMSWorks Software Private Limited\\" +
                "Solutions - Documents\\AIRTEL\\CienaL0_SuperCollector\\notif.txt");
        StringBuilder sb = new StringBuilder();
        String line = null;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            //String text = null;

            // repeat until all lines are read
            Set<String> s = new HashSet<String>();
            int size = s.size();

            while ((line = reader.readLine()) != null) {

                if (line.contains("Trying to convert eventNotification")) {

                    String[] data = sb.toString().trim().split("\n");

                    for (String sdata : data) {

                        String[] parts = sdata.split("EventNotification");
                        System.out.println(parts[1]);
                        Iterator<String> it = s.iterator();
                        while (it.hasNext()) {

                            s.add(parts[1]);
                            size = s.size();
                        }
                    }
                    sb.setLength(0);
                } else {
                    sb.append(line).append("\n");
                }
            }
            System.out.println(s);


        } catch (IOException e) {
            e.printStackTrace();
//        } finally {
//
//            System.out.println("Out");
//        }
//
//        System.out.println(sb.toString());
        }
    }

}
