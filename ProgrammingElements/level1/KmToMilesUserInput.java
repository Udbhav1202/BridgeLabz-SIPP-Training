package ProgrammingElements.level1;
import java.util.*;

public class KmToMilesUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("inter KM = ");
		int km = sc.nextInt();
		double miles = (double)km/1.609;
		System.out.println("The total miles is "+miles+" mile for the given "+ km+" km");
		sc.close();
	}
}
