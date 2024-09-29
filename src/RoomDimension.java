/**
 * RoomDimension Class
 * This class models the dimensions of a room with a length and width.
 * It provides a method to calculate the area of the room.
 */
public class RoomDimension {
    private double length;
    private double width;

    // Constructor to initialize room dimensions
    public RoomDimension(double len, double w) {
        this.length = len;
        this.width = w;
    }

    // Method to calculate and return the area of the room
    public double getArea() {
        return length * width;
    }

    // toString method to return a string representation of the dimensions
    @Override
    public String toString() {
        return "Room Dimensions [Length: " + length + ", Width: " + width + "]";
    }
}
