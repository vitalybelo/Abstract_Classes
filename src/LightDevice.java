public abstract class LightDevice {

    public static final double MAX_BRIGHTNESS = 1.0;
    public static final double MIN_BRIGHTNESS = 0.0;

    protected final int power;
    protected double brightness;

    public LightDevice(int power) {
        this.power = power;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        if (brightness < MIN_BRIGHTNESS) {
            this.brightness = MIN_BRIGHTNESS;
        } else this.brightness = Math.min(brightness, MAX_BRIGHTNESS);
    }

    public void changeBrightness (double rate) {
        double change = brightness * (1.0 + rate);
        setBrightness(change);
    }

    public abstract double getEnergyConsumption ();

}
