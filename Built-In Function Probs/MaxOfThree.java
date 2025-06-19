import java.util.Scanner;

public class MaxOfThree {

    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        int[] nums = getInput();
        int max = findMax(nums[0], nums[1], nums[2]);
        displayResult(max);
    }
}
