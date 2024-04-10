import java.util.Scanner;

public class Practical6_q4 {

    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;
        int count = 0;
        for (String value : values) {
            if (value == null) {
                throw new NullPointerException("Array element is null");
            }
            try {
                sum += Double.parseDouble(value);
                count++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Element is incorrectly formatted: " + value);
            }
        }
        if (count == 0) {
            throw new NullPointerException("Array is empty");
        }
        return sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        String[] values = new String[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.next();
        }

        scanner.close();

        try {
            double avg = average(values);
            System.out.println("Average: " + avg);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
