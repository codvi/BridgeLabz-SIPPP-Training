import java.util.Scanner;

public class RecursiveFactorial {

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static void displayResult(int result) {
        System.out.println("Factorial is: " + result);
    }

    public static void main(String[] args) {
        int n = getInput();
        int result = factorial(n);
        displayResult(result);
    }
}
