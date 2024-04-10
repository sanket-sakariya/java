public class Practical4_2_q1 {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 words as command-line arguments.");
            return;
        }

        for (String word : args) {
            System.out.println("Word: " + word);
            System.out.println("Reversed: " + reverseString(word));
            System.out.println("Is Palindrome: " + isPalindrome(word));
            System.out.println();
        }
    }

    public static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
