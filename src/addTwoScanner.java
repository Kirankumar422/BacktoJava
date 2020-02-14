import java.util.Scanner;

public class addTwoScanner {

    public static void main(String[] args) {

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide any one number for addition: ");
        num1 = sc.nextInt();

        System.out.print("Provide second number for addition: ");
        num2 = sc.nextInt();

        sc.close();

        sum = num1 + num2;
        System.out.print("Sum of entered numbers are: " + sum);

    }

}
