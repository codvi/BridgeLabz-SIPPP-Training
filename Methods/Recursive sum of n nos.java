public static int sumRecursive(int n) {
    if (n == 1) return 1;
    return n + sumRecursive(n - 1);
}

public static int sumFormula(int n) {
    return (n * (n + 1)) / 2;
}
