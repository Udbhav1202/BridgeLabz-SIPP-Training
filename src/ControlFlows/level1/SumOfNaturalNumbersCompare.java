package ControlFlows.level1;
import java.util.*;
public class SumOfNaturalNumbersCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n*(n+1)/2;
		int total = 0;
		int var = 1;
		while(var != n) {
			total += var;
			var++;
		}
		boolean result = total == sum;
		System.out.println(result);

	}

}
