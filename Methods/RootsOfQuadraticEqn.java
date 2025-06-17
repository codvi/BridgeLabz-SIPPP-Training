public static double[] findQuadraticRoots(double a, double b, double c) {
    double delta = b * b - 4 * a * c;
    if (delta > 0) {
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{r1, r2};
    } else if (delta == 0) {
        double r = -b / (2 * a);
        return new double[]{r};
    } else {
        return new double[]{}; // No real roots
    }
}
