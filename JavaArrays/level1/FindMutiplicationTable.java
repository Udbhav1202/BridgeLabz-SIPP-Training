package JavaArrays.level1;
import java.util.*;
public class FindMutiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] multiRes = new int[4];
		for(int i=0; i<multiRes.length; i++) {
			multiRes[i] = number*(i+6);
			
		}
		for(int i=0; i<multiRes.length; i++) {
			System.out.println(number+" * "+(i+6)+" = "+ multiRes[i]);
		}
	}

}
