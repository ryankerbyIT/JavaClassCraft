import java.util.Scanner;

/**
 * Geometry Class
 * This class provides static methods to calculate the area of a circle,
 * rectangle, and triangle. It also includes input validation to ensure
 * non-negative values are used for calculations.
 */
public class Geometry {
    
    // Method to calculate the area of a circle
    public static double areaOfCircle(double radius) {
        if (radius < 0) {
            System.out.println("Error: The radius cannot be negative.");
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a rectangle
    public static double areaOfRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Error: Length and width cannot be negative.");
            return -1;
        }
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Error: Base and height cannot be negative.");
            return -1;
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display the menu
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Calculate the area of a circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = areaOfCircle(radius);
                    if (circleArea != -1) {
                        System.out.printf("The area of the circle is: %.2f\n", circleArea);
                    }
                    break;

                case 2:
                    // Calculate the area of a rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = areaOfRectangle(length, width);
                    if (rectangleArea != -1) {
                        System.out.printf("The area of the rectangle is: %.2f\n", rectangleArea);
                    }
                    break;

                case 3:
                    // Calculate the area of a triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = areaOfTriangle(base, height);
                    if (triangleArea != -1) {
                        System.out.printf("The area of the triangle is: %.2f\n", triangleArea);
                    }
                    break;

                case 4:
                    // Quit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Error: Please enter a number between 1 and 4.");
            }

            System.out.println(); // Add a blank line for better readability
        } while (choice != 4);

        scanner.close();
    }
}

/**
 * This program demonstrates the use of the Geometry class.
 * It provides a menu for the user to select the type of area calculation (circle, rectangle, triangle)
 * and ensures that input values are valid (non-negative). It will continue to prompt the user until they choose to quit.
 */
