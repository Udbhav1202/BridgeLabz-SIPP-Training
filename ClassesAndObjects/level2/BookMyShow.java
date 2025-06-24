package ClassesAndObjects.level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("🎟️ Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("\n=== Ticket Details ===");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class BookMyShow {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Interstellar", 42, 280.0);
        ticket.displayTicket();
    }
}
