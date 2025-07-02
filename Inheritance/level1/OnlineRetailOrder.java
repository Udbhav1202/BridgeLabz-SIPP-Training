package Inheritance.level1;

class Order{
	int orderId;
	String orderDate;
	
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
}

class ShippedOrder extends Order{
	int trackingNumber;
	
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
}

class DeliveredOrder extends ShippedOrder{
	String date;
	
	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String date){
		super(orderId,orderDate,trackingNumber);
		this.date = date;
		
	}
	
	
	void getOrderStatus() {
		System.out.println("Order ID: "+orderId);
		System.out.println("Order Date: "+orderDate);
		System.out.println("Tracking Number: "+trackingNumber);
		System.out.println("Delivery Date: "+date);
	}
}
public class OnlineRetailOrder {

	public static void main(String[] args) {
		DeliveredOrder order = new DeliveredOrder(234, "12/11/2025", 5435213, "16/11/2025");
		order.getOrderStatus();

	}

}
