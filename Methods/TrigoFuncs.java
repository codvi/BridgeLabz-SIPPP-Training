public static double[] calculateTrigonometricFunctions(double angle) {
    double radians = Math.toRadians(angle);
    return new double[]{
        Math.sin(radians),
        Math.cos(radians),
        Math.tan(radians)
    };
}
