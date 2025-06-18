package JavaMethods.level1;

import java.util.Scanner;

public class SumUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println(sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
}
