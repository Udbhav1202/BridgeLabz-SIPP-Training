package JavaArrays.level1;
import java.util.*;
public class TakeInputAndCheckPosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				if(arr[i]%2==0) {
					System.out.println("Positive and even");
				}else {
					System.out.println("Positive and odd");
				}
			}else if(arr[i]<0) {
				System.out.println("Negative");
			}else {
				System.out.println("zero");
			}
		}
		if(arr[0] == arr[arr.length-1]) {
			System.out.println("Equal");
		}else if(arr[0]>arr[arr.length-1]) {
			System.out.println("greater");
		}else {
			System.out.println("lesser");
		}

	}

}
