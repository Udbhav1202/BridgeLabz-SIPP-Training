package ThisFinalStaticKeyword;

class Product {
    private static double discount = 5.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000.0, 1, 101);
        Product p2 = new Product("Mouse", 1500.0, 2, 102);

        p1.displayDetails();
        p2.displayDetails();

        updateDiscount(10.0);
        System.out.println("\nUpdated Discount:");
        p1.displayDetails();
    }
}
