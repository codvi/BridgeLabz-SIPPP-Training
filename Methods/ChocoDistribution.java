public static int[] divideChocolates(int chocolates, int children) {
    int quotient = chocolates / children;
    int remainder = chocolates % children;
    return new int[]{quotient, remainder};
}
