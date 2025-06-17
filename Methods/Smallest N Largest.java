public static int[] findSmallestAndLargest(int a, int b, int c) {
    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b, c));
    return new int[]{smallest, largest};
}
