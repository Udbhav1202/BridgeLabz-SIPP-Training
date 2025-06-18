package JavaMethods.level3;

import java.util.Scanner;

public class DistanceAndLineEquation {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1); 
        double b = y1 - (m * x1);                
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        double[] result = calculateLineEquation(x1, y1, x2, y2);
        double m = result[0];
        double b = result[1];
        System.out.println("Equation of the line: y = " + m + "x + " + b);
    }
}
