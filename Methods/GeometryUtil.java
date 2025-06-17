public class GeometryUtil {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3, x2 = 6, y2 = 7;
        System.out.println("Distance: " + calculateDistance(x1, y1, x2, y2));
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Line: y = " + line[0] + "x + " + line[1]);
    }
}
