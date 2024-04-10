import java.util.Scanner;

public class Practical10_q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalValue = scanner.nextInt();
        scanner.close();

        String binaryValue = dec2Bin(decimalValue);
        System.out.println("Binary equivalent of " + decimalValue + " is: " + binaryValue);
    }

    public static String dec2Bin(int value) {
        if (value == 0) {
            return "0";
        } else if (value == 1) {
            return "1";
        } else {
            int quotient = value / 2;
            int remainder = value % 2;
            return dec2Bin(quotient) + remainder;
        }
    }
}
