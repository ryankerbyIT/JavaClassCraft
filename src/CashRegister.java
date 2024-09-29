import java.io.FileWriter;
import java.io.IOException;

/**
 * CashRegister Class
 * This class simulates the sale of a retail item.
 * It accepts a RetailItem object and the quantity of items being purchased.
 * Provides methods to calculate subtotal, sales tax, and total cost.
 */
public class CashRegister {
    private RetailItem item;
    private int quantity;

    // Constructor that accepts a RetailItem object and quantity of items
    public CashRegister(RetailItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Method to calculate and return the subtotal (price * quantity)
    public double getSubtotal() {
        return item.getPrice() * quantity;
    }

    // Method to calculate and return the sales tax (6% of the subtotal)
    public double getTax() {
        return getSubtotal() * 0.06;
    }

    // Method to calculate and return the total (subtotal + tax)
    public double getTotal() {
        return getSubtotal() + getTax();
    }

    // Method to generate a sales receipt and save it to a file
    public void generateReceipt() {
        try (FileWriter writer = new FileWriter("sales_receipt.txt")) {
            writer.write("SALES RECEIPT\n");
            writer.write("Unit Price: $" + String.format("%.2f", item.getPrice()) + "\n");
            writer.write("Quantity: " + quantity + "\n");
            writer.write("Subtotal: $" + String.format("%.2f", getSubtotal()) + "\n");
            writer.write("Sales Tax: $" + String.format("%.2f", getTax()) + "\n");
            writer.write("Total: $" + String.format("%.2f", getTotal()) + "\n");
            System.out.println("Receipt has been generated and saved to 'sales_receipt.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the receipt file.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        RetailItem item = new RetailItem("Laptop", 1500.00);
        CashRegister register = new CashRegister(item, 3);

        // Display subtotal, tax, and total
        System.out.println("Subtotal: $" + register.getSubtotal());
        System.out.println("Sales Tax: $" + register.getTax());
        System.out.println("Total: $" + register.getTotal());

        // Generate and save receipt to file
        register.generateReceipt();
    }
}

/**
 * RetailItem Class (Assuming this is the RetailItem class from Chapter 6)
 * This class represents an item with a description and price.
 */
class RetailItem {
    private String description;
    private double price;

    // Constructor to initialize item description and price
    public RetailItem(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }
}

/**
 * This program simulates a cash register using the CashRegister class.
 * It accepts a RetailItem object and quantity, calculates the subtotal, tax, and total,
 * and writes a sales receipt to a file.
 */
