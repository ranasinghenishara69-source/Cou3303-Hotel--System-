public class Reservation {
    private String reservationId;
    private Guest guest;
    private Room room;
    private int numberOfNights;

    // Parameterized Constructor
    public Reservation(String reservationId, Guest guest, Room room, int numberOfNights) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    // Calculate Total Bill
    public double calculateTotalBill() {
        return room.getPricePerNight() * numberOfNights;
    }

    // Display Reservation Details
    public void displayReservationDetails() {
        System.out.println("========================================");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("----------------------------------------");
        System.out.println("Guest Details:");
        System.out.println("  Guest ID: " + guest.getGuestId());
        System.out.println("  Guest Name: " + guest.getGuestName());
        System.out.println("  Contact Number: " + guest.getContactNumber());
        System.out.println("----------------------------------------");
        System.out.println("Room Details:");
        System.out.println("  Room Number: " + room.getRoomNumber());
        System.out.println("  Room Type: " + room.getRoomType());
        System.out.println("  Price Per Night: Rs. " + room.getPricePerNight());
        System.out.println("  Available: " + room.isAvailable());
        System.out.println("----------------------------------------");
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Total Bill: Rs. " + calculateTotalBill());
        System.out.println("========================================\n");
    }

    // Getters
    public String getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    // Setters
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", guest=" + guest +
                ", room=" + room +
                ", numberOfNights=" + numberOfNights +
                ", totalBill=" + calculateTotalBill() +
                '}';
    }
}
