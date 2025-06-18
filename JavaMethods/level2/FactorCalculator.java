package JavaMethods.level2;

import java.util.Scanner;

public class FactorCalculator {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int product(int[] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }
        return result;
    }

    public static int sumOfSquares(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (int)Math.pow(arr[i], 2);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println(sum(factors));
        System.out.println(sumOfSquares(factors));
        System.out.println(product(factors));
    }
}
