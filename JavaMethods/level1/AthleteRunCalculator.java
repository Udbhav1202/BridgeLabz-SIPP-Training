package JavaMethods.level1;

import java.util.Scanner;

public class AthleteRunCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println(rounds);
    }

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }
}
