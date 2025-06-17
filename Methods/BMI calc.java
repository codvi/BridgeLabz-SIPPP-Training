public static void calculateBMI(double[][] people) {
    for (int i = 0; i < 10; i++) {
        double weight = people[i][0];
        double height = people[i][1] / 100.0;
        people[i][2] = weight / (height * height);
    }
}

public static String[] getBMIStatus(double[][] people) {
    String[] status = new String[10];
    for (int i = 0; i < 10; i++) {
        double bmi = people[i][2];
        if (bmi < 18.4) status[i] = "Underweight";
        else if ((bmi > 18.5) || (bmi < 24.9) status[i] = "Normal";
        else if ((bmi > 25.0)||(bmi <39.9)) status[i] = "Overweight";
        else status[i] = "Obese";
    }
    return status;
}
