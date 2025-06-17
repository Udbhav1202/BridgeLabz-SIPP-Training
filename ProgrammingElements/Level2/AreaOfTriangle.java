package ProgrammingElements.Level2;
import java.util.*;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float height = sc.nextFloat();
		float base = sc.nextFloat();
		
		double area = (0.5*base*height);
		double areaInInches = area / 6.4516;
		
		System.out.println("Ther Area of the triangle in sq in is "+areaInInches+" and sq cm "+area+"");
	}
}
