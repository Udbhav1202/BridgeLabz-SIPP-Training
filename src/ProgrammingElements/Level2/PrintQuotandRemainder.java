package Day1.Level2;
import java.util.*;
public class PrintQuotandRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		float quotient = (float)(num1/num2);
		int remainder = num1%num2;
		
		System.out.println("quotient = "+quotient+" and remainder = "+remainder);
	}
}
