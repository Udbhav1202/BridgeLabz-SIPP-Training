package Review;

import java.util.*;
public class BillingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] product = {"Sugar", "Water", "Wafers"};
		int[] price = {40, 20, 40};
		for(int i=0; i<price.length; i++) {
			System.out.println(i+1+": "+product[i]+ ":    "+price[i]);
		}
		System.out.println("4: Bill ");
		int total = 0;
		double discPrice = 0;
		int choice;
		int decide;
		do {
			do {
				System.out.print("Select the product: ");
				choice = sc.nextInt();
				if(choice == 4) {
					if(total>=50) {
						discPrice = total*0.1;
						System.out.println("Total Billing Amount: "+total+" \nAfter Discount Billing Amount: "+(total-discPrice));
					}else {
						System.out.println("Total Billing Amount: "+total);
					}
					
				}
				if(choice>=price.length) {
					System.out.println("Invalid input");
					continue;
				}else {
					System.out.println(product[choice]+ "     "+price[choice]);
					total +=price[choice];
				}
				
			}while(choice!=4);
			System.out.println("Do You Want Shop More \n1: yes \n2: No");
			decide = sc.nextInt();
		}while(decide != 2);
		if(total>=50) {
			discPrice = total*0.1;
			System.out.println("Total Billing Amount: "+total+" \nAfter Discount Billing Amount: "+(total-discPrice));
			System.out.println("Thank You for visiting us");
		}else {
			System.out.println("Total Billing Amount: "+total);
			System.out.println("Thank You for visiting us");
		}
		
		
		
		
		
		
	}

}
