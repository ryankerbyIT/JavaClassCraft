/**
 * Car Instrument Simulator
 * This program demonstrates the interaction between the FuelGauge and Odometer classes.
 * It simulates filling the car with fuel and running the car until it runs out of fuel.
 */
public class CarInstrumentSimulator {
    public static void main(String[] args) {
        // Create a FuelGauge object
        FuelGauge fuelGauge = new FuelGauge();

        // Fill the tank to maximum capacity (15 gallons)
        for (int i = 0; i < 15; i++) {
            fuelGauge.incrementFuel();
        }

        // Create an Odometer object, passing in the FuelGauge object
        Odometer odometer = new Odometer(fuelGauge);

        // Simulate driving the car until it runs out of fuel
        while (fuelGauge.getFuelLevel() > 0) {
            odometer.incrementMileage();
            System.out.println("Current mileage: " + odometer.getMileage() + " miles");
            System.out.println("Current fuel level: " + fuelGauge.getFuelLevel() + " gallons");
        }

        System.out.println("The car has run out of fuel.");
    }
}
