package JavaStrings.level1;
import java.util.*;
public class CharArrayCompare {
	
	public static char[] getCharacters(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }
	
	public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] builtInArray = input.toCharArray();

        char[] customArray = getCharacters(input);

        boolean isSame = compareCharArrays(builtInArray, customArray);
        
        System.out.println(isSame);
	}

}
