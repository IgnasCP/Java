public class Gauge {
    private int value;

    public int Gauge() {
        return 0;
    }

    public void increase() {
        if (value < 5) {
            value++;
        }
    }
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        if (value == 5) {
            return true;
        }
        return false;
    }
}