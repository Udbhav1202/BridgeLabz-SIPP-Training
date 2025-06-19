package JavaStrings.level2;
import java.util.Scanner;
public class StringLengthFinder {
	 public static int getLengthWithoutBuiltIn(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                str.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	       
	        }
	        return count;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();  

        int calculatedLength = getLengthWithoutBuiltIn(input);
        int builtInLength = input.length();

        System.out.println("Length (without using length()): " + calculatedLength);
        System.out.println("Length (using length()): " + builtInLength);

	}

}
