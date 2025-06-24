package ClassesAndObjects.level1;

class MobilePhone{
	String brand;
	String model;
	int price;
	
	public MobilePhone(String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
}
public class HandleMobilePhoneDetails {

	public static void main(String[] args) {
		MobilePhone phone1 = new MobilePhone("Apple", "iPhone 12", 60000);
		MobilePhone phone2 = new MobilePhone("Samsung", "S24 Ultra", 100000);
		phone1.display();
		phone2.display();
	}

}
