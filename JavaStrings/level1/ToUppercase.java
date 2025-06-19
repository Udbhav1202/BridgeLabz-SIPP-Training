package JavaStrings.level1;
import java.util.*;
public class ToUppercase {
	public static String toUpper(String s) {
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >'a' && arr[i] < 'z') {
				arr[i] = (char)(arr[i]-32);
			}
		}
		return new String(arr);
	}
	
	public static boolean compare(String s, String s2) {
		return s.equals(s2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		toUpper(s);
		String s2 = sc.next();
		s2.toUpperCase();
		System.out.println(compare(s,s2));

	}

}
