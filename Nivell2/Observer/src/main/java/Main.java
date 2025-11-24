public class Main {
    public static void main(String[] args) {
        Agency phenix = new Agency("Phenix Stocks");
        Broker shark = new Broker("up", "down");
        shark.subscribe("up", phenix);
        shark.notifyUpdate("up", "Nvidia -> 5% increase");
    }
}
