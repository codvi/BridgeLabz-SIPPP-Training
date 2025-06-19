import java.util.Scanner;

public class PalindromeChecker {

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine().toLowerCase();
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(boolean result) {
        if (result)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(result);
    }
}
