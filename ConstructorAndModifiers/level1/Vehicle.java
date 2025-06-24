package ConstructorAndModifiers.level1;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    public Vehicle(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Scooter");
        Vehicle v2 = new Vehicle("Priya", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(750.0);

        v1.displayVehicleDetails();  
        v2.displayVehicleDetails();
    }
}

