package application;

// Always returns a fixed value and always on
public class StandardSensor implements Sensor {
    private int value;

    // Constructor for StandardSensor
    public StandardSensor(int value) {
        this.value = value;
    }
