package JavaStrings.level1;
import java.util.*;
public class NumberExceptionHandler {
	
	public static int generate(String s) {
        return Integer.parseInt(s);
    }
	
	public static int handle(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException => " + e.getMessage());
            return -1;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(handle(s));

	}

}
