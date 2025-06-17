package JavaArrays.level1;
import java.util.*;
public class EvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] even = new int[(number/2)+1];
		int[] odd = new int[(number/2)+1];
		int p1 = 0;
		int p2 = 0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				even[p1] = i;
				p1++;
			}else if(i%2==1) {
				odd[p2] = i;
				p2++;
			}
		}
		for(int i=0; i<even.length; i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0; i<odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
