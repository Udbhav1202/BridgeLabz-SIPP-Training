package Day1.Level2;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float add = num1 + num2;
        float sub = num1 - num2;
        float multiply = num1 * num2;
        float divide = num1 / num2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + multiply + ", and " + divide);
    }
}
