package ScenarioBasedProblem;

import java.util.Arrays;
import java.util.*;

public class IceCreamFlaour {
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
        
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] flaour = {"Chocolate", "Butter Scotch", "Vanilla", "Strawberry", "Mango", "Black Currant", "Pista", "Kesar Pista"};
    	int[] arr = new int[8];
    	for(int i=1; i<=7; i++) {
    		System.out.println("---------------Day: "+i+"---------------");
    		boolean running = true;
    		System.out.println("\nSelect an item to add to cart:");
            System.out.println("1. Chocolate");
            System.out.println("2. Butter Scotch");
            System.out.println("3. Vanilla");
            System.out.println("4. Strawberry");
            System.out.println("5. Mango");
            System.out.println("6. Black Currant");
            System.out.println("7. Pista");
            System.out.println("8. Kesar Pista");
            System.out.println("9. Shop Close");
            while (running) {
            	
                System.out.print("Select an option: ");

                int choice = sc.nextInt();
                if (choice >= 1 && choice <= 8) {
                    arr[choice - 1]++;
                } else if (choice == 9) {
                    running = false;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
            System.out.println("--------Total flaour sell in Day: "+i+"-----------");
            for(int j=0; j<arr.length; j++) {
            	System.out.println(flaour[j]+" -> "+arr[j]);
            }
            
    	}
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
