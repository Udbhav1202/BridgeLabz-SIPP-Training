package JavaMethods.level3;
import java.util.*;
public class FindShortestTallest {
	
	public static int get3DigitNum() {
		return (int)(Math.random()*(250-150+1))+150;
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int smallest(int[] arr) {
		int small = 500;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		return small;
	}
	
	public static int large(int[] arr) {
		int large = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		return large;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[11];
		for(int i=0; i<11; i++) {
			arr[i] = get3DigitNum();
		}
		smallest(arr);
		large(arr);
		
		

	}

}
