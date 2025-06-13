package ProgrammingElements.level1;
import java.util.*;

public class DiscountedFessUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = 10;
        double discountAmount = fee * (discountPercent / 100.0);
        System.out.println("The discount amount is INR  " +discountAmount +" and final discounted fee is INR "+(fee-discountAmount));
    }
}
