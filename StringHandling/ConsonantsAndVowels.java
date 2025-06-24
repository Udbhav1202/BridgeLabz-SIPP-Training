package StringHandling;
import java.util.*;
public class ConsonantsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int vowels = 0;
		int conso = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
    
                c = Character.toLowerCase(c);

                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    conso++;
                }
            }
		}
		
		System.out.println(vowels +" " + conso);

	}

}
