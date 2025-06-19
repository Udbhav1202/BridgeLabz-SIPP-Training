package JavaStrings.level2;
import java.util.*;
public class ManualSplit {
	 public static int getLength(String s) {
	        int count = 0;
	        try {
	            while (true) {
	                s.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	           
	        }
	        return count;
	    }
	 
	 public static String[] manualSplit(String s) {
	        int length = getLength(s);

	    
	        int spaceCount = 0;
	        for (int i = 0; i < length; i++) {
	            if (s.charAt(i) == ' ') {
	                spaceCount++;
	            }
	        }

	
	        int wordCount = spaceCount + 1;
	        String[] words = new String[wordCount];

	        int wordStart = 0;
	        int wordIndex = 0;

	        for (int i = 0; i <= length; i++) {
	            if (i == length || s.charAt(i) == ' ') {
	                StringBuilder word = new StringBuilder();
	                for (int j = wordStart; j < i; j++) {
	                    word.append(s.charAt(j));
	                }
	                words[wordIndex++] = word.toString();
	                wordStart = i + 1;
	            }
	        }

	        return words;
	    }
	 
	 public static boolean compareArrays(String[] a1, String[] a2) {
	        if (a1.length != a2.length) return false;

	        for (int i = 0; i < a1.length; i++) {
	            if (!a1[i].equals(a2[i])) return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();

	        String[] builtInSplit = input.split(" ");


	        String[] customSplit = manualSplit(input);

	
	        System.out.println("\nBuilt-in split:");
	        for (String word : builtInSplit) {
	            System.out.println(word);
	        }

	        System.out.println("\nCustom split:");
	        for (String word : customSplit) {
	            System.out.println(word);
	        }

	        boolean isEqual = compareArrays(builtInSplit, customSplit);
	        System.out.println("\nAre both splits equal? " + isEqual);

	}

}
