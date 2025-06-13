package ControlFlows.level1;
import java.util.*;

import java.util.Scanner;

public class CheckTheNaturalNumAndSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		
		if(n>0) {
			sum = n*(n+1)/2;
			System.out.println("The sum of "+sum+" natural numbers is "+n);
		}else {
			System.out.println("The number "+n+" is not a natural number");
		}
		

	}

}