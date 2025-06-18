package JavaMethods.level3;

public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int count) {
        int[][] employeeData = new int[count][2];

        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); 
            int years = 1 + (int)(Math.random() * 10);         
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; 

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    public static void displayData(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("ID  OldSalary  ServiceYrs  Bonus      NewSalary");
        System.out.println("------------------------------------------------");
        
        

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println((i + 1) + "   " + oldSalary + "       " + years + "         " +
                               (int)bonus + "        " + (int)newSalary);
        }


        System.out.println("------------------------------------------------");
        System.out.println("TOTAL  " + (int)totalOldSalary + "           " + (int)totalBonus + "        " + (int)totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayData(employeeData, bonusData);
    }
}

