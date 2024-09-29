/**
 * Odometer Class
 * This class simulates a car's odometer.
 * It tracks the car's current mileage, with a maximum mileage of 999,999 miles.
 * Works with a FuelGauge object to decrement fuel every 24 miles.
 */
public class Odometer {
    private int mileage;
    private final int MAX_MILEAGE = 999999;
    private final int MILES_PER_GALLON = 24;
    private FuelGauge fuelGauge;

    // Constructor to initialize mileage and associate a FuelGauge object
    public Odometer(FuelGauge fuelGauge) {
        this.mileage = 0;
        this.fuelGauge = fuelGauge;
    }

    // Method to increment the mileage by 1 mile
    public void incrementMileage() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else {
            mileage = 0; // Reset mileage if it exceeds MAX_MILEAGE
        }

        // Decrease fuel for every 24 miles driven
        if (mileage % MILES_PER_GALLON == 0) {
            fuelGauge.decrementFuel();
        }
    }

    // Method to get the current mileage
    public int getMileage() {
        return mileage;
    }
}
