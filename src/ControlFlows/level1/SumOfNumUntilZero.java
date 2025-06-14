package ControlFlows.level1;
import java.util.*;
public class SumOfNumUntilZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double n = sc.nextDouble();
		while(n != 0) {
			sum += n;
			n = sc.nextDouble();
		}
		System.out.println(sum);

	}

}
