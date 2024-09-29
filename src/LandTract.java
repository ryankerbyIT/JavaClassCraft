/**
 * LandTract Class
 * This class represents a piece of land with length and width.
 * It provides methods to calculate the area, check equality with another tract,
 * and return a string representation of the land dimensions.
 */
public class LandTract {
    private double length;
    private double width;

    // Constructor to initialize the land tract dimensions
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate and return the area of the tract
    public double getArea() {
        return length * width;
    }

    // Equals method to compare two land tracts
    public boolean equals(LandTract otherTract) {
        return this.getArea() == otherTract.getArea();
    }

    // toString method to return a string representation of the land tract
    @Override
    public String toString() {
        return "LandTract [Length: " + length + ", Width: " + width + ", Area: " + getArea() + "]";
    }

    public static void main(String[] args) {
        // Example usage
        LandTract tract1 = new LandTract(10, 20);
        LandTract tract2 = new LandTract(15, 20);

        // Display the land tracts
        System.out.println(tract1.toString());
        System.out.println(tract2.toString());

        // Compare the two tracts
        if (tract1.equals(tract2)) {
            System.out.println("The two tracts are of equal size.");
        } else {
            System.out.println("The two tracts are of different sizes.");
        }
    }
}

/**
 * This program demonstrates the use of the LandTract class.
 * It creates two LandTract objects, displays their dimensions and areas,
 * and checks if they are of equal size.
 */
