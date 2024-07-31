package application;

import java.util.ArrayList;
import java.util.List;

/**
 * AverageSensor is a sensor that combines multiple sensors and returns the average
 * of their readings. It also tracks all readings performed.
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors; // List of sensors that the average sensor controls
    private List<Integer> readings; // List of all readings performed

    /**
     * Constructor for AverageSensor. Initializes the sensor list and readings list.
     */
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    /**
     * Adds a sensor to the AverageSensor's list of sensors.
     * @param toAdd The sensor to add.
     */
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    /**
     * Returns true if all sensors are on, false otherwise.
     */
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Turns on all the sensors.
     */
    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    /**
     * Turns off all the sensors.
     */
    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    /**
     * Returns the average of the readings from all sensors.
     * Throws an IllegalStateException if the AverageSensor is off or if no sensors
     * have been added.
     */
    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("The sensor is off or no sensors have been added");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }

    /**
     * Returns a list of all readings performed by the AverageSensor.
     * @return List of readings.
     */
    public List<Integer> readings() {
        return this.readings;
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }
}
