package JavaMethods.level2;

import java.util.*;
public class LeapYear {
	public static String year(int n) {
		if(n >= 1582) {
			if(n%4==0 && n%400==0) {
				return "Leap Year";
			}else {
				return "Not a Leap Year";
			}
		}
		return "Not Valid Input";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		year(n);
	}

}
