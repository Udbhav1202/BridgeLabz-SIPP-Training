package Inheritance.level1;


class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType +
                           ", Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity; 

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType +
                           ", Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType +
                           ", Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
public class VehicleAndTransport {

	public static void main(String[] args) {
		 Vehicle[] vehicles = new Vehicle[3];

	        vehicles[0] = new Car(180, "Petrol", 5);
	        vehicles[1] = new Truck(120, "Diesel", 15);
	        vehicles[2] = new Motorcycle(160, "Petrol", false);

	        for (Vehicle v : vehicles) {
	            v.displayInfo();  
	        }

	}

}
