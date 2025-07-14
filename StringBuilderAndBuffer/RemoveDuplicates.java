package StringBuilderAndBuffer;

import java.util.HashSet;

public class RemoveDuplicates {
	public static String remDuplicate(String s) {
		StringBuilder sb = new StringBuilder("");
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
	        if (!set.contains(c)) {
	            set.add(c);
	            sb.append(c);
	        }
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "cobracoco";
		System.out.print(remDuplicate(s));

	}

}
