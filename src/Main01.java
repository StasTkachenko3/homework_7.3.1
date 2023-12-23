public class Main01 {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();

        System.out.println("Flashlight is initially off: " + !flashlight.isLight());

        flashlight.on();
        System.out.println("Flashlight is on: " + flashlight.isLight());

        flashlight.off();
        System.out.println("Flashlight is off: " + !flashlight.isLight());

        flashlight.on();
        flashlight.on();
        flashlight.on();
        flashlight.on();
        flashlight.on();
        System.out.println("Flashlight is on: " + flashlight.isLight());
    }
}