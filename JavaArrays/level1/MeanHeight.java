package JavaArrays.level1;
import java.util.*;
public class MeanHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[11];
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			double n = sc.nextDouble();
			arr[i] = n;
			sum += n;
		}
		System.out.println((sum/11.0));
		
		// TODO Auto-generated method stub

	}

}
