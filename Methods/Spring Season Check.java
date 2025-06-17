public static boolean isSpringSeason(int month, int day) {
    return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
}
