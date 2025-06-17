package ControlFlows.level1;
import java.util.*;
public class CheckNumNegOrPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Negative Number");
		}else if(n==0) {
			System.out.println("Zero");
		}else {
			System.out.println("Positive");
		}

	}

}