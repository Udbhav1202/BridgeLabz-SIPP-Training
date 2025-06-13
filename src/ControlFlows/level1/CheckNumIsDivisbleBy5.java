package ControlFlows.level1;
import java.util.*;
public class CheckNumIsDivisbleBy5 {
	public static void main(String[] args) {
		boolean divisble = true;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%5==0) {
			System.out.println(divisble);
		}else {
			divisble = false;
			System.out.println(divisble);
		}
	}
}