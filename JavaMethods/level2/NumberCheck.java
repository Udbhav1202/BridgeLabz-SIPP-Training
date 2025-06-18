package JavaMethods.level2;

import java.util.Scanner;

public class NumberCheck {
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 == number2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                if (isEven(nums[i])) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(-1);
            }
        }
        int result = compare(nums[0], nums[4]);
        System.out.println(result);
    }
}

