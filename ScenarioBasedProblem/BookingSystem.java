package ScenarioBasedProblem;

import java.util.*;

public class BookingSystem<T extends Booking> {
    private List<T> bookings = new ArrayList<>();
    private Set<String> bookedSeats = new HashSet<>();

    public boolean addBooking(T booking) {
        if (bookedSeats.contains(booking.getSeatNumber())) {
            System.out.println("Seat already booked: " + booking.getSeatNumber());
            return false;
        }

        bookings.add(booking);
        bookedSeats.add(booking.getSeatNumber());
        System.out.println("Booking successful for: " + booking.getPassengerName());
        return true;
    }

    public boolean isSeatAvailable(String seatNumber) {
        return !bookedSeats.contains(seatNumber);
    }

    public List<T> getAllBookings() {
        return bookings;
    }
}
