import java.util.Scanner;

public class BasicCalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return (double) a / b;
    }

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose operation: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nYour choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + subtract(a, b));
            case 3 -> System.out.println("Result: " + multiply(a, b));
            case 4 -> {
                try {
                    System.out.println("Result: " + divide(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
