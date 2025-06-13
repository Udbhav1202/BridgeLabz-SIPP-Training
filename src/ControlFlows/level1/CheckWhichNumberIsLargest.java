package ControlFlows.Level1;
import java.util.*;
public class CheckWhichNumberIsLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		boolean num1res = false;
		boolean num2res = false;
		boolean num3res = false;
		if(num1>num2 && num1>num3) {
			num1res = true;
		}else if(num2>num1 && num2>num3) {
			num2res = true;
		}else {
			num3res = true;
		}
		System.out.println("Is the first number the largest? "+num1res+"\nIs the second number the largest? "+num2res+"\nIs the third number the largest? "+num3res+"\n"
				+ "");
		

	}

}
