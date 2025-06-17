package ControlFlows.level3;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 1582) {
			if(n%4==0 && n%400==0) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Not a Leap Year");
			}
		}
	}

}
