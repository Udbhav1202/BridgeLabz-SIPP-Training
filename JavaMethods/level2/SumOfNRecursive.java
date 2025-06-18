package JavaMethods.level2;
import java.util.*;
public class SumOfNRecursive {
	public static int sum(int n) {
		if(n == 0) {
			return n;
		}
		n += sum(n-1);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(sum(n) == (n*(n+1)/2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
