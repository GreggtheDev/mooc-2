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

// Constructor for AverageSensor
public AverageSensor() {
    this.sensors = new ArrayList<>();
    this.readings = new ArrayList<>();
}

// Adds a sensor to list of sensors
public void addSensor(Sensor toAdd) {
    this.sensors.add(toAdd);
}