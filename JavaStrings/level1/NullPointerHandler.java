package JavaStrings.level1;
import java.util.*;
public class NullPointerHandler {
	public static int generateException(String s) {
		int n = s.length();
		return n;
	}
	
	public static int exceptionHandling(String s) {
		try {
			return s.length();
		}catch(NullPointerException e) {
			System.out.println("NullPointerException => "+ e.getMessage());
			return -1;
		}
	}
	public static void main(String[] args) {
		String s = null;
		System.out.println(exceptionHandling(s));

	}

}
