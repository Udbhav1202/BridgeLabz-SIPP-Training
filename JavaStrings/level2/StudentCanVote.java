package JavaStrings.level2;
import java.util.*;
public class StudentCanVote {
	public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // 2-digit number: 10 to 99
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }
	
	 public static String[][] checkVotingEligibility(int[] ages) {
	        int n = ages.length;
	        String[][] result = new String[n][2];

	        for (int i = 0; i < n; i++) {
	            int age = ages[i];
	            result[i][0] = String.valueOf(age);

	            if (age < 0) {
	                result[i][1] = "false"; 
	            } else if (age >= 18) {
	                result[i][1] = "true";
	            } else {
	                result[i][1] = "false"; 
	            }
	        }

	        return result;
	    }
	 
	 public static void displayTable(String[][] data) {
	        System.out.printf("%-10s | %-15s\n", "Age", "Can Vote?");
	        System.out.println("---------------------------");

	        for (String[] row : data) {
	            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
	        }
	    }

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        int[] ages = generateAges(n);

	        String[][] result = checkVotingEligibility(ages);

	        displayTable(result);
	}

}
