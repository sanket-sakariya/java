import java.util.*;

public class Practiccal2_q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " elements:");
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] uniqueArray = eliminateDuplicates(inputArray);

        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Array after eliminating duplicates: " + Arrays.toString(uniqueArray));

        scanner.close();
    }

    public static int[] eliminateDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
