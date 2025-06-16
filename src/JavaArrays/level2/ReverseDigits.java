package JavaArrays.level2;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number > 0) {
            if (index == digits.length) {
                int[] temp = new int[digits.length + 10];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}

