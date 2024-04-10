import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Practical10_q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter elements (enter -1 to stop):");
        int element;
        while ((element = scanner.nextInt()) != -1) {
            list.add(element);
        }

        ArrayList<Integer> resultList = removeDuplicates(list);

        System.out.println("Original List: " + list);
        System.out.println("List with duplicates removed: " + resultList);

        scanner.close();
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}