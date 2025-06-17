public static int[] findRemainderAndQuotient(int number, int divisor) {
    int quotient = number / divisor;
    int remainder = number % divisor;
    return new int[]{quotient, remainder};
}
