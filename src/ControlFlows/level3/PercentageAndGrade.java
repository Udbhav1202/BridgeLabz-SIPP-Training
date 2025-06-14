package ControlFlows.level3;
import java.util.*;
public class PercentageAndGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int math = sc.nextInt();
		
		double percentage = ((phy+chem+math)/300.0)*100;
		if (percentage >= 81) {
		    System.out.println("Marks " + percentage + " Grade A");
		} else if (percentage >= 71) {
		    System.out.println("Marks " + percentage + " Grade B");
		} else if (percentage >= 61) {
		    System.out.println("Marks " + percentage + " Grade C");
		} else if (percentage >= 51) {
		    System.out.println("Marks " + percentage + " Grade D");
		} else if (percentage >= 41) {
		    System.out.println("Marks " + percentage + " Grade E");
		} else {
		    System.out.println("Marks " + percentage + " Grade R");
		}
	}

}
