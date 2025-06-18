package JavaMethods.level1;

import java.util.Scanner;

public class ChocolateDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }
}
