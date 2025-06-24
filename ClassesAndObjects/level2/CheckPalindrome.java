package ClassesAndObjects.level2;
class PalindromeChecker{
	String text;
	
	public PalindromeChecker(String text) {
		this.text = text;
	}
	
	public boolean isPalindrome() {
		int l = 0;
		int r = text.length()-1;
		while(l<=r) {
			if(text.charAt(l) != text.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	public void display() {
		System.out.println(isPalindrome());
	}
}
public class CheckPalindrome {

	public static void main(String[] args) {
		PalindromeChecker check = new PalindromeChecker("abaa");
		check.display();
		

	}

}
