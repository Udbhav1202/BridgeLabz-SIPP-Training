package JavaMethods.level1;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println(interest);
        System.out.println(principal);
        System.out.println(rate);
        System.out.println(time);
    }

    public static double calculateSimpleInterest(double p, double r, double t) {
        return p * r * t / 100;
    }
}
