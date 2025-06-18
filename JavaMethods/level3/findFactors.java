package JavaMethods.level3;
import java.util.*;
public class findFactors {
	public static void factor(int n) {
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		int idx = 0;
		int[] arr = new int[cnt];
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				arr[idx] = i;
				idx++;
			}
		}
	}
	
	public static int greatestFactor(int[] arr) {
		return arr[arr.length-1];
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int product(int[] arr) {
		int prod = 0;
		for(int i=0; i<arr.length; i++) {
			prod *= arr[i];
		}
		return prod;
	}
	
	public static double pow(int prod) {
		return Math.pow((double)(prod), Math.pow((double)(prod), (double)(prod)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}

}
