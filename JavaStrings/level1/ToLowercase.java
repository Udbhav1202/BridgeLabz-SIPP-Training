package JavaStrings.level1;
import java.util.Scanner;

public class ToLowercase {

    public static String toLower(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }

    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        String customLower = toLower(s);
        String builtInLower = s2.toLowerCase();

        System.out.println("Custom lowercase:  " + customLower);
        System.out.println("Built-in lowercase:" + builtInLower);
        System.out.println("Are both equal?    " + compare(customLower, builtInLower));
    }
}
