import java.util.Scanner;

public class FibonacciGenerator {

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int terms = getInput();
        generateFibonacci(terms);
    }
}
