package StringBuilderAndBuffer;

public class ReverseString {
	public static String revString(String s) {
		StringBuilder sb = new StringBuilder("");
		for(int i =s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(revString(s));

	}

}
