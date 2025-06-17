public static int findYoungest(int[] ages) {
    return Math.min(ages[0], Math.min(ages[1], ages[2]));
}

public static double findTallest(double[] heights) {
    return Math.max(heights[0], Math.max(heights[1], heights[2]));
}
