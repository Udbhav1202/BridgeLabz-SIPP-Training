package ScenarioBasedProblem;

public class Booking {
    private String passengerName;
    private String bookingId; 
    private String seatNumber;

    public Booking(String passengerName, String bookingId, String seatNumber) {
        this.passengerName = passengerName;
        this.bookingId = bookingId;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return passengerName + " - " + bookingId + " - Seat: " + seatNumber;
    }
}

