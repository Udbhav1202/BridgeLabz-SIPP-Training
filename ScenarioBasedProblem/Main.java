package ScenarioBasedProblem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookingSystem<Booking> flightSystem = new BookingSystem<>();

        Booking b1 = new Booking("Alice", "FL123", "12A");
        Booking b2 = new Booking("Bob", "FL123", "12B");
        Booking b3 = new Booking("Charlie", "FL123", "12A"); 
        Booking b4 = new Booking("Alex","FL123", "12B");

        flightSystem.addBooking(b1); 
        flightSystem.addBooking(b2); 
        flightSystem.addBooking(b3); 
        flightSystem.addBooking(b4);

        System.out.println("\n Seat Availability:");
        System.out.println("Is seat 12A available? " + flightSystem.isSeatAvailable("12A"));
        System.out.println("Is seat 12C available? " + flightSystem.isSeatAvailable("12C"));

        System.out.println("\n All Bookings:");
        List<Booking> allBookings = flightSystem.getAllBookings();
        for (int i = 0; i < allBookings.size(); i++) {
            Booking b = allBookings.get(i);
            System.out.println(b);
        }

    }
}
