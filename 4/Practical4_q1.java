import java.util.Scanner;
public class Practical4_q1 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 words:");
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }

        scanner.close();

        for (String word : words) {
            String reversedWord = reverseString(word);
            boolean isPalindrome = isPalindrome(reversedWord);
            System.out.println("Word: " + word + ", Reversed: " + reversedWord + ", Palindrome: " + isPalindrome);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

    