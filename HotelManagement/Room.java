class Room{
    private int roomNumber;
    private boolean isAvailable;
    private double price;

    public Room(int roomNumber, String roomType,boolean isAvailable,double price){
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}