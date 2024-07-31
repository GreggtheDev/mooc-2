package application;

/**
 * TemperatureSensor is a sensor that randomly returns a temperature value
 * between -30 and 30 when it is on.
 */
public class TemperatureSensor implements Sensor {
    private boolean isOn;
