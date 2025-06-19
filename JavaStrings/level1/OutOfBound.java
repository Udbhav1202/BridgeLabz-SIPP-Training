package JavaStrings.level1;
import java.util.*;
public class OutOfBound {
	public static int generate(int[] arr) {
		return arr[arr.length+1];
	}
	
	public static int errorHandle(int[] arr) {
		try {
			return arr[arr.length];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		errorHandle(arr);

	}

}
