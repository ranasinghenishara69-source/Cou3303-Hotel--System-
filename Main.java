public class Main {
    public static void main(String[] args) {
        // Create Guests
        Guest guest1 = new Guest(1, "Nimal Perera", "0771234567");
        Guest guest2 = new Guest(2, "Kamal Silva", "0719876543");

        // Create Rooms
        Room room1 = new Room(205, "Deluxe", 8500.00, true);
        Room room2 = new Room(306, "Suite", 15000.00, true);

        // Create Reservations
        Reservation reservation1 = new Reservation("RES001", guest1, room1, 4);
        Reservation reservation2 = new Reservation("RES002", guest2, room1, 5);

        // Display Reservation Details
        System.out.println("\n==================== HOTEL RESERVATION SYSTEM ====================\n");

        System.out.println("RESERVATION 1:");
        reservation1.displayReservationDetails();

        System.out.println("RESERVATION 2:");
        reservation2.displayReservationDetails();

        // Additional Information
        System.out.println("==================== ROOM CHARGE CALCULATION ====================");
        System.out.println("Room 1 (Deluxe) - Charge for 7 nights: Rs. " + room1.calculateRoomCharge(7));
        System.out.println("Room 2 (Suite) - Charge for 3 nights: Rs. " + room2.calculateRoomCharge(3));
        System.out.println("==================================================================\n");
    }
}
