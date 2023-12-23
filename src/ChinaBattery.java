public class ChinaBattery {
    private int charge = 5;

    public boolean charge() {
        if (charge > 0) {
            charge--;
            return true;
        } else {
            return false;
        }
    }
}