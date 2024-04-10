import java.util.Scanner;

public class Practical6_q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the marks: ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks >100) {
                throw new IllegalMarkException(marks);
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } catch (IllegalMarkException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

class IllegalMarkException extends Exception {
    public IllegalMarkException(int marks) {
        super("Illegal mark: " + marks + ". Marks cannot be negative or higher than 100.");
    }
}
