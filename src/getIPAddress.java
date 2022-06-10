import java.util.Scanner;

public class getIPAddress {

    public static void main(String[] args) {

        try {

            System.out.println("Please enter the hostname to get IP Address: ");
            Scanner sc = new Scanner(System.in);
            String hostname = sc.next();
            String ip = java.net.InetAddress.getByName(hostname).getHostAddress();
            System.out.println("IP Address for host " + hostname + " is: " + ip);
        }

        catch (Exception e) {

            System.out.println(e);
        }

    }
}
