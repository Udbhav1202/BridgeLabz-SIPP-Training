package JavaStrings.level1;

public class StringIndexOutOfBound {

	public static int generate(String s) {
		return s.charAt(s.length());
	}
	
	public static int errorHandle(String s) {
		try {
			return s.charAt(s.length());
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException => " + e.getMessage());
			return -1;
		}
	}

	public static void main(String[] args) {
		String s = "qwerte";
		errorHandle(s);

	}

}
