import java.util.Random;

public class ZaraBonusCalculator {
    public static double[][] generateEmployeeData(int count) {
        Random rand = new Random();
        double[][] data = new double[count][2]; // [salary, yearsOfService]

        for (int i = 0; i < count; i++) {
            int salary = rand.nextInt(90000) + 10000; // 5-digit salary
            int years = rand.nextInt(10) + 1; // 1-10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonuses(double[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; // [newSalary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonus = years > 5 ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s\n", "Emp#", "OldSal", "YOS", "Bonus", "NewSal", "Bonus%");
        for (int i = 0; i < oldData.length; i++) {
            double oldSal = oldData[i][0];
            int years = (int) oldData[i][1];
            double newSal = newData[i][0];
            double bonus = newData[i][1];
            double bonusPercent = (bonus / oldSal) * 100;

            System.out.printf("%-5d %-10.2f %-10d %-10.2f %-10.2f %-10.1f%%\n", 
                (i + 1), oldSal, years, bonus, newSal, bonusPercent);

            totalOld += oldSal;
            totalNew += newSal;
            totalBonus += bonus;
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary : %.2f\n", totalOld);
        System.out.printf("Total New Salary : %.2f\n", totalNew);
        System.out.printf("Total Bonus Paid : %.2f\n", totalBonus);
    }
}
