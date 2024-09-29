/**
 * RoomCarpet Class
 * This class models a carpet that covers a room.
 * It contains the room's dimensions and the carpet cost per square foot.
 * It provides a method to calculate the total cost of carpeting the room.
 */
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    // Constructor to initialize the RoomCarpet with dimensions and cost
    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    // Method to calculate and return the total cost of carpeting the room
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    // toString method to return a string representation of the carpet information
    @Override
    public String toString() {
        return "Room Carpet [Size: " + size + ", Carpet Cost per Sq Ft: $" + carpetCost + "]";
    }

    public static void main(String[] args) {
        // Example usage
        RoomDimension room = new RoomDimension(12, 10); // 12 feet by 10 feet room
        RoomCarpet carpet = new RoomCarpet(room, 8.0);  // $8 per square foot

        // Display the room dimensions and carpet cost
        System.out.println(room.toString());
        System.out.println(carpet.toString());

        // Display the total cost of carpeting the room
        System.out.println("Total cost of carpeting: $" + carpet.getTotalCost());
    }
}

/**
 * This program demonstrates the use of the RoomDimension and RoomCarpet classes.
 * It creates a room with specified dimensions and calculates the total cost
 * of carpeting based on a given price per square foot.
 */
