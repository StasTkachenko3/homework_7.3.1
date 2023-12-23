public class Flashlight {
    private boolean light;
    private ChinaBattery battery = new ChinaBattery();

    public void on() {
        if (!light && battery.charge()) {
            light = true;
            System.out.println("Flashlight is on");
        } else {
            System.out.println("Flashlight cannot be turned on");
        }
    }

    public void off() {
        if (light) {
            light = false;
            System.out.println("Flashlight is off");
        } else {
            System.out.println("Flashlight is already off");
        }
    }

    public boolean isLight() {
        return light;
    }
}