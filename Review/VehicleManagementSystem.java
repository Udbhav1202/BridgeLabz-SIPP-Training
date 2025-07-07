package Review;



class Vehicle{
	String brand;
	String model;
	String fuelType;
	
	public Vehicle(String brand, String model, String fuelType) {
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
	}
	
	void printServiceDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("FuelType: "+fuelType);
		System.out.println("-------------------------------------------");

	}

	public double calculateServiceCost() {
		return 0.0;
	}
	
	
}

class Car extends Vehicle{
	String carName;
	public Car(String brand, String model, String fuelType, String carName) {
		super(brand, model, fuelType);
		this.carName = carName;
	}
	void printServiceDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("FuelType: "+fuelType);
		System.out.println("CarName: "+carName);
		System.out.println("-------------------------------------------");

	}
	public double calculateServiceCost() {
		return 10000.0;
	}
}

class Bike extends Vehicle{
	String bikeName;
	
	public Bike(String brand, String model, String fuelType, String bikeName) {
		super(brand, model, fuelType);
		this.bikeName = bikeName;
	}
	
	void printServiceDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("FuelType: "+fuelType);
		System.out.println("BikeName: "+bikeName);
		System.out.println("-------------------------------------------");

	}
	public double calculateServiceCost() {
		return 80000.0;
	}
}

class Truck extends Vehicle{
	String truckName;
	
	public Truck(String brand, String model, String fuelType, String truckName) {
		super(brand, model, fuelType);
		this.truckName = truckName;
	}
	void printServiceDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("FuelType: "+fuelType);
		System.out.println("TruckName: "+truckName);
		System.out.println("-------------------------------------------");
	}
	public double calculateServiceCost() {
		return 20000.0;
	}
}
public class VehicleManagementSystem {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("BMW", "XYZ", "Diesel", "A6");
        vehicles[1] = new Truck("Tata", "XYZ", "Diesel","Truckx");
        vehicles[2] = new Bike("Suzuki", "XYZ", "Diesel","Truckx");
        for (int i = 0; i < vehicles.length; i++) {
        	vehicles[i].printServiceDetails();
        	System.out.println("Service Cost: " + vehicles[i].calculateServiceCost());
        	System.out.println("-------------------------------------------");
        }


	}

}
