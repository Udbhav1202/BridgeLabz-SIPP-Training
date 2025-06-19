package JavaStrings.level1;
import java.util.Scanner;
public class SubString {
	
	public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
	
	public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String builtInSub = "";
		builtInSub = input.substring(start, end);
		
		String customSub = customSubstring(input, start, end);
		boolean isEqual = compareStrings(builtInSub, customSub);
		
		 System.out.println("Are both equal?     " + isEqual);
	}

}
