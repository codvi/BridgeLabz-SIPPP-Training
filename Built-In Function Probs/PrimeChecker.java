import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        return sc.nextInt();
    }

    public static void displayResult(boolean result) {
        if (result)
            System.out.println("The number is a prime number.");
        else
            System.out.println("The number is not a prime number.");
    }

    public static void main(String[] args) {
        int num = getInput();
        boolean result = isPrime(num);
        displayResult(result);
    }
}
