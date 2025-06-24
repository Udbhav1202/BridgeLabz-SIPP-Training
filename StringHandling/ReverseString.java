package StringHandling;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			char temp = arr[r];
			arr[r] = arr[l];
			arr[l] = temp;
			l++;
			r--;
		}
		
		System.out.println(new String(arr));


	}

}
