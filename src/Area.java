/**
 * Area Class
 * This class contains three overloaded static methods to calculate the area of:
 * 1. A circle.
 * 2. A rectangle.
 * 3. A cylinder.
 * The methods are overloaded based on the parameters passed to them.
 */

public class Area {
    
    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double width, double length) {
        return width * length;
    }

    // Method to calculate the area of a cylinder
    public static double calculateArea(double radius, double height, boolean isCylinder) {
        if (isCylinder) {
            return Math.PI * Math.pow(radius, 2) * height;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Testing the overloaded methods
        double circleArea = Area.calculateArea(5.0);
        double rectangleArea = Area.calculateArea(4.0, 6.0);
        double cylinderArea = Area.calculateArea(3.0, 7.0, true);

        // Display the results
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the cylinder: " + cylinderArea);
    }
}

/**
 * This class demonstrates the use of overloaded static methods to calculate
 * areas for different shapes. The main method tests these methods by
 * calculating and displaying the area for a circle, rectangle, and cylinder.
 */
