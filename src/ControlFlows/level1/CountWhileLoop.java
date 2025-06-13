package ControlFlows.level1;
import java.util.*;
public class CountWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n >= 1) {
			System.out.println(n);
			n--;
		}
	}

}