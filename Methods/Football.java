import java.util.Random;

public class FootballStats {

    public static int getSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double getMean(int[] heights) {
        return getSum(heights) / (double) heights.length;
    }

    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++)
            heights[i] = 150 + rand.nextInt(101); // 150 to 250

        System.out.println("Mean: " + getMean(heights));
        System.out.println("Shortest: " + getShortest(heights));
        System.out.println("Tallest: " + getTallest(heights));
    }
}
