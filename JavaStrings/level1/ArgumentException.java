package JavaStrings.level1;

public class ArgumentException {

	public static String generate(String s) {
		return s.substring(5,3);
	}
	
	public static String errorHandle(String s) {
		try {
			return s.substring(5,3);
		}catch(StringIndexOutOfBoundsException  e) {
			System.out.println("StringIndexOutOfBoundsException  => " + e.getMessage());
			return "";
		}
	}

	public static void main(String[] args) {
		String s = "qwertesersf";
		errorHandle(s);

	}

}
