package JavaStrings.level1;
import java.util.*;
public class CompareStrings {
	
	public static boolean compare(char[] arr1, char[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}else {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		boolean ans = compare(arr1,arr2);
		System.out.println(ans);
		boolean ans2 = str1.equals(str2);
		System.out.println(ans2);
		if(ans == ans2) {
			System.out.println("Result is same");
		}else {
			System.out.println("Result is not same");
		}
		

	}

}
