package ClassesAndObjects.level2;
import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotal());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
        System.out.println("✅ " + item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = items.removeIf(i -> i.itemName.equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println("❌ " + itemName + " removed from cart.");
        } else {
            System.out.println("⚠️ " + itemName + " not found.");
        }
    }

    public void displayCart() {
        double total = 0;
        System.out.println("\n🛒 Cart Contents:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotal();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class CartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Headphones", 1500, 1));
        cart.addItem(new CartItem("USB Cable", 250, 2));
        cart.displayCart();

        cart.removeItem("USB Cable");
        cart.displayCart();
    }
}
