package JavaMethods.level1;

import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkNumber(number);
        System.out.println(result);
    }

    public static int checkNumber(int n) {
        if (n < 0) return -1;
        else if (n > 0) return 1;
        else return 0;
    }
}
