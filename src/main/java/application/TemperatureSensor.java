package application;

import java.util.Random;

/**
 * TemperatureSensor is a sensor that randomly returns a temperature value
 * between -30 and 30 when it is on.
 */
public class TemperatureSensor implements Sensor {
    private boolean isOn;

    // Constructor for temperaturesensor
    public TemperatureSensor() {
        this.isOn = false;
    }

    /**
     * Returns true if the sensor is on, false otherwise.
     */
    @Override
    public boolean isOn() {
        return this.isOn;
    }

    /**
     * Turns the sensor on.
     */
    @Override
    public void setOn() {
        this.isOn = true;
    }

    /**
     * Turns the sensor off.
     */
    @Override
    public void setOff() {
        this.isOn = false;
    }

    /**
     * Returns a random temperature between -30 and 30 if the sensor is on.
     * Throws an IllegalStateException if the sensor is off.
     */
    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("The sensor is off");
        }
        Random random = new Random();
        return random.nextInt(61) - 30; // Random number between -30 and 30
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");
    }
}
