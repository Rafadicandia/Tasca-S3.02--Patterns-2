public class StockX {
    private int value;
    private boolean up;

    public StockX(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    private void setValue(int newValue) {
        int prevVal = getValue();
        if (prevVal >= newValue) {
            this.value = newValue;
            up = false;
        } else {
            this.value = newValue;
            up = true;
        }
    }

}
