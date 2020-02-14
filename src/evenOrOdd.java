import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {

        int num;
        System.out.print("Enter an Integer Number: ");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num % 2 == 0)
            System.out.print("Entered number is even");
        else
            System.out.print("Entered number is odd");
    }
}
