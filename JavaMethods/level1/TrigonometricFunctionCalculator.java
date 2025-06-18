package JavaMethods.level1;

import java.util.Scanner;

public class TrigonometricFunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }
}
