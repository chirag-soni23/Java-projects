import java.util.ArrayList;
import java.util.Date;

public class HotelManagementSystem {
    private final ArrayList<Room> rooms;
    private final ArrayList<Booking> bookings;

    public HotelManagementSystem() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, 1500));
        rooms.add(new Room(102, 2000));
        rooms.add(new Room(103, 2500));
        rooms.add(new Room(104, 3000));
    }

    public void checkIn(String guestName, String contactNumber, int roomNumber, Date checkInDate, Date checkOutDate) {
        Room room = findRoomByNumber(roomNumber);
        if (room != null && room.isAvailable()) {
            Customer customer = new Customer(guestName, contactNumber);
            Booking booking = new Booking(room, customer, checkInDate, checkOutDate);
            bookings.add(booking);
            room.setAvailable(false);
            System.out.println("Check-in successful for room " + roomNumber);
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void checkOut(int roomNumber) {
        Room room = findRoomByNumber(roomNumber);
        if (room != null && !room.isAvailable()) {
            room.setAvailable(true);
            System.out.println("Check-out successful for room " + roomNumber);
        } else {
            System.out.println("Room is not currently occupied.");
        }
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void checkIn(String guestName, int i, int roomNumber, Date checkInDate, Date checkOutDate) {
        throw new UnsupportedOperationException("Unimplemented method 'checkIn'");
    }
}
