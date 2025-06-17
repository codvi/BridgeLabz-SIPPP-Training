public static int[] getFactors(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) if (n % i == 0) count++;

    int[] factors = new int[count];
    int idx = 0;
    for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;

    return factors;
}

public static int sum(int[] arr) {
    int s = 0;
    for (int a : arr) s += a;
    return s;
}

public static long product(int[] arr) {
    long p = 1;
    for (int a : arr) p *= a;
    return p;
}

public static double sumOfSquares(int[] arr) {
    double s = 0;
    for (int a : arr) s += Math.pow(a, 2);
    return s;
}
