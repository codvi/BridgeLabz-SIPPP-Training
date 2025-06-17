import java.util.Arrays;

public class NumberChecker {

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for(int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    static int[] reverseDigits(int[] digits) {
        int[] reversed = digits.clone();
        for (int i = 0; i < reversed.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }
        return reversed;
    }

    static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseDigits(digits));
    }

    static boolean isDuckNumber(int[] digits) {
        for(int i = 1; i < digits.length; i++) {
            if(digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 1201;
        int[] digits = getDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reverseDigits(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
