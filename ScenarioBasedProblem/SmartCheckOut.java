package ScenarioBasedProblem;

import java.util.*;

public class SmartCheckOut {

    private static final HashMap<String, Integer> priceMenu = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in); 

    static {
        priceMenu.put("Sugar", 40);
        priceMenu.put("Chips", 20);
        priceMenu.put("Coffee", 200);
        priceMenu.put("Cookie", 100);
    }

    public static int getPrice(String s) {
        return priceMenu.getOrDefault(s, 0);
    }

    public static ArrayList<String> addCustomer() {
        ArrayList<String> list = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an item to add to cart:");
            System.out.println("1. Sugar");
            System.out.println("2. Chips");
            System.out.println("3. Coffee");
            System.out.println("4. Cookie");
            System.out.println("5. Checkout");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    list.add("Sugar");
                    break;
                case 2:
                    list.add("Chips");
                    break;
                case 3:
                    list.add("Coffee");
                    break;
                case 4:
                    list.add("Cookie");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Final Cart: " + list);
        return list;
    }


    public static void main(String[] args) {
        Queue<ArrayList<String>> queue = new LinkedList<>();
        queue.add(addCustomer());
        queue.add(addCustomer());

        int customerNumber = 1;

        while (!queue.isEmpty()) {
            ArrayList<String> cart = queue.poll(); 
            System.out.println("\n--- Customer " + customerNumber + " ---");
            System.out.println("Customer's Cart: " + cart);
            System.out.println("Itemized Bill:");

            int total = 0;
            for (String item : cart) {
                int price = getPrice(item);
                System.out.println("- " + item + ": " + price);
                total += price;
            }

            System.out.println("Total: " + total);
            customerNumber++;
        }

        sc.close(); 
    }
}
