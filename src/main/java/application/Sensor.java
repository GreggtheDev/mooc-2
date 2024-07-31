package application;

// Interface for Sensor that can read a value and be turned on/off
public interface Sensor {
    boolean isOn();    // Returns true if the sensor is on.
    void setOn();      // Sets the sensor on.
    void setOff();     // Sets the sensor off.
    int read();        // Returns the value of the sensor if it's on.
    // If the sensor is not on, throws an IllegalStateException.
}
