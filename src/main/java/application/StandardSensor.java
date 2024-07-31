package application;

// Always returns a fixed value and always on
public class StandardSensor implements Sensor {
    private int value;

    // Constructor for StandardSensor
    public StandardSensor(int value) {
        this.value = value;
    }

    /**
     * Always returns true since the sensor is always on.
     */
    @Override
    public boolean isOn() {
        return true;
    }

    /**
     * Does nothing since the sensor is always on.
     */
    @Override
    public void setOn() {
        // Does nothing
    }

    /**
     * Does nothing since the sensor is always on.
     */
    @Override
    public void setOff() {
        // Does nothing
    }

    /**
     * Returns the fixed value of the sensor.
     */
    @Override
    public int read() {
        return this.value;
    }

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
}

