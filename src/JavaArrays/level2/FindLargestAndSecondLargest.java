package JavaArrays.level2;
import java.util.*;
public class FindLargestAndSecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[10];
		int index = 0;
		while(number !=0) {
			if(index == arr.length) {
				break;
			}
			arr[index] = number%10;
			number = number/10;
			index++;
			
		}
		int largest = 0;
		int secLargest = 0;
		for(int i=0; i<arr.length; i++) {
			if(largest<arr[i]) {
				secLargest = largest;
				largest = arr[i];
			}else if(secLargest<arr[i] && arr[i] != largest) {
				secLargest = arr[i];
			}
		}
		System.out.println(largest +"  "+ secLargest);
	}

}
