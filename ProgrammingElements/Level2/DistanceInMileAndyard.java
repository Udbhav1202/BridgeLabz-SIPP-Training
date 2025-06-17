package ProgrammingElements.Level2;
import java.util.*;
public class DistanceInMileAndyard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distanceInFeet = sc.nextDouble();
		double distanceInMiles = distanceInFeet/5280;
		
		System.out.println("Distance in Miles = "+distanceInMiles);
		
		

	}

}
