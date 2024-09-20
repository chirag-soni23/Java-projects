class Room{
    private final int roomNumber;
    private boolean isAvailable;
    private final double price;

    public Room(int roomNumber,double price){
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}