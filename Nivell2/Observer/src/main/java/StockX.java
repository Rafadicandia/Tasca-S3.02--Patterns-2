public class StockX {
    private int value;
    private Broker info;

    public StockX(int value, Broker info) {
        this.value = value;
        this.info = info;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public Broker getInfo() {
        return info;
    }

    private void setInfo(Broker info) {
        this.info = info;
    }
}
