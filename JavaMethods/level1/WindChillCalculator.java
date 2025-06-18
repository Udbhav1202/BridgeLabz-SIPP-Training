package JavaMethods.level1;

import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double speed = sc.nextDouble();
        double result = calculateWindChill(temp, speed);
        System.out.println(result);
    }

    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }
}
