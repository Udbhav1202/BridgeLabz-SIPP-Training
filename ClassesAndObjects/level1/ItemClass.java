package ClassesAndObjects.level1;

class Item{
	int itemCode;
	String itemName;
	int price;
	int quantity;
	
	public Item(int itemCode, String itemName, int price, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println("ItemCode: " + itemCode);
		System.out.println("ItemName :"+ itemName);
		
		System.out.println("Price : " + price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total Cost: " + price*quantity);
	}
}
public class ItemClass {

	public static void main(String[] args) {
		Item item = new Item(22, "Soap", 20, 5);
		item.display();

	}

}
