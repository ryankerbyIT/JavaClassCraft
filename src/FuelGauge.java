/**
 * FuelGauge Class
 * This class simulates a car's fuel gauge.
 * It tracks the current fuel amount in gallons, with a maximum capacity of 15 gallons.
 * Provides methods to increment (add fuel) and decrement (burn fuel) the fuel amount.
 */
public class FuelGauge {
    private int fuelLevel;
    private final int MAX_FUEL = 15;

    // Constructor to initialize the fuel level to 0
    public FuelGauge() {
        this.fuelLevel = 0;
    }

    // Method to increment the fuel level by 1 gallon
    public void incrementFuel() {
        if (fuelLevel < MAX_FUEL) {
            fuelLevel++;
        } else {
            System.out.println("Fuel tank is full.");
        }
    }

    // Method to decrement the fuel level by 1 gallon
    public void decrementFuel() {
        if (fuelLevel > 0) {
            fuelLevel--;
        } else {
            System.out.println("Out of fuel.");
        }
    }

    // Method to get the current fuel level
    public int getFuelLevel() {
        return fuelLevel;
    }
}
