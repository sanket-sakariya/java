import java.util.Scanner;

public class Practical2_q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        if (commonPrefix.length() > 0) {
            System.out.println("Largest common prefix: " + commonPrefix);
        } else {
            System.out.println("No common prefix found.");
        }

        scanner.close();
    }
}

