package JavaMethods.level2;

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static int getBMIStatus(double bmi) {
        if (bmi < 18.5) return 0;
        if (bmi >= 18.5 && bmi < 24.9) return 1;
        if (bmi >= 25 && bmi < 29.9) return 2;
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        int[] status = new int[10];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getBMIStatus(data[i][2]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][1]);
            System.out.println(data[i][0]);
            System.out.println(data[i][2]);
            System.out.println(status[i]);
        }
    }
}

