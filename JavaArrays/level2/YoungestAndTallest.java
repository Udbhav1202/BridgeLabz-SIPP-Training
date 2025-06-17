package JavaArrays.level2;
import java.util.*;
public class YoungestAndTallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<age.length; i++) {
			height[i] = sc.nextInt();
			age[i] = sc.nextInt();
		}
		int youngest = Integer.MAX_VALUE;
		int tallest = 0;
		for(int i=0; i<age.length; i++) {
			if(youngest>age[i]) {
				youngest = age[i];
			}
			if(tallest<height[i]) {
				tallest = height[i];
			}
		}
		System.out.println(youngest+" "+tallest);

	}

}
