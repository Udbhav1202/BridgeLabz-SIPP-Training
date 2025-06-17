package ControlFlows.level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int serviceYears = sc.nextInt();

        if (serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        }else {
        	System.out.println("No Bonus");
        }
    }
}
