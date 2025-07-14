package StringBuilderAndBuffer;

public class ConcatenateString {
	public static String concat(String[] arr) {
		StringBuffer sf = new StringBuffer("");
		for(int i=0; i<arr.length; i++) {
			sf.append(arr[i]);
		}
		return sf.toString();
	}

	public static void main(String[] args) {
		String[] arr = {"Udbhav", "Srivastava"};
		System.out.print(concat(arr));
	}

}
