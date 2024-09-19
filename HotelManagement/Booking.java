
import java.util.Date;

class Booking{
    private Room room;
    private Customer customer;
    private Date checkInDate;
    private Date checkOutDate;

    public Booking(Room room, Customer customer, Date checkInDate, Date checkOutDate){
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
    
}