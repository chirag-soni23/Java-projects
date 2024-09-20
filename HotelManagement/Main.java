import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HotelManagementSystem hotel = new HotelManagementSystem();
        hotel.checkIn("John Doe", "1234567890", 101, new Date(), new Date());
        hotel.checkOut(101);
    }
}
