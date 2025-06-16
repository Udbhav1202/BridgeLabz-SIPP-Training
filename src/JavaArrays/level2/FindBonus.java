package JavaArrays.level2;

import java.util.*;

public class FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salary = new int[10];
        int[] year = new int[10];

        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
            year[i] = sc.nextInt();
        }

        double[] newSalary = new double[10];

        for (int i = 0; i < newSalary.length; i++) {
            if (year[i] > 5) {
                newSalary[i] = salary[i] + (salary[i] * 0.05);
            } else {
                newSalary[i] = salary[i];
            }
        }

        for (int i = 0; i < newSalary.length; i++) {
            System.out.println(newSalary[i]);
        }
    }
}
