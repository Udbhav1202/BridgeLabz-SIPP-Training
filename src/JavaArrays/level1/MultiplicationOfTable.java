package JavaArrays.level1;
import java.util.*;
public class MultiplicationOfTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int n = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i] = n*(i+1);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(n+" * "+(i+1)+" = "+arr[i]);
		}
	}
}
