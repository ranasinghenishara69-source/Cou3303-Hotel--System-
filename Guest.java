public class Guest {
    private int guestId;
    private String guestName;
    private String contactNumber;

    // Constructor
    public Guest(int guestId, String guestName, String contactNumber) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.contactNumber = contactNumber;
    }

    // Getters
    public int getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Setters
    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
