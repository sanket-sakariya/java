import java.util.Scanner;

public class Practical2_q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        System.out.println("Enter elements for first 3x3 array:");
        inputArrayValues(scanner, array1);

        System.out.println("Enter elements for second 3x3 array:");
        inputArrayValues(scanner, array2);

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performOperation(array1, array2, "addition");
                break;
            case 2:
                performOperation(array1, array2, "subtraction");
                break;
            case 3:
                performOperation(array1, array2, "multiplication");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void inputArrayValues(Scanner scanner, int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void performOperation(int[][] array1, int[][] array2, String operation) {
        int[][] resultArray = new int[3][3];

        switch (operation) {
            case "addition":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        resultArray[i][j] = array1[i][j] + array2[i][j];
                    }
                }
                break;
            case "subtraction":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        resultArray[i][j] = array1[i][j] - array2[i][j];
                    }
                }
                break;
            case "multiplication":
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            resultArray[i][j] += array1[i][k] * array2[k][j];
                        }
                    }
                }
                break;
        }

        System.out.println("Result of " + operation + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}