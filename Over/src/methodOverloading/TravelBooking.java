package methodOverloading;  // remove this line if you don't want a package

public class TravelBooking {

    // 1) Book a bus ticket
    public void bookTicket(String busNumber, String date) {
        System.out.println("Bus ticket booked: Bus #" 
            + busNumber + " on " + date);
    }

    // 2) Book a flight ticket with class type
    public void bookTicket(String flightNumber, String date, String seatClass) {
        System.out.println("Flight ticket booked: Flight #" 
            + flightNumber + " on " + date 
            + " in " + seatClass + " class");
    }

    // 3) Book a train ticket with coach number
    public void bookTicket(String trainNumber, String date, int coachNumber) {
        System.out.println("Train ticket booked: Train #" 
            + trainNumber + " on " + date 
            + ", Coach No. " + coachNumber);
    }

    public static void main(String[] args) {
        TravelBooking tb = new TravelBooking();

        // Simulate booking all three types:
        tb.bookTicket("B42", "2025-05-10");
        tb.bookTicket("AI-202", "2025-06-01", "Business");
        tb.bookTicket("T123", "2025-07-15", 5);
    }
}

