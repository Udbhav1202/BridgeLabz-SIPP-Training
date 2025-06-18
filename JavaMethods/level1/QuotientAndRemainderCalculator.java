package JavaMethods.level1;

import java.util.Scanner;

public class QuotientAndRemainderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(num, divisor);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }
}
