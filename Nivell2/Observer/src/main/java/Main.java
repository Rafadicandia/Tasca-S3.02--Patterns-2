public class Main {
    public static void main(String[] args) {
        Agency phenix = new Agency("Phenix Stocks");
        Agency stateHouse = new Agency("State House");
        Agency newStock = new Agency("New Stock");

        Broker shark = new Broker("up", "down");
        shark.subscribe("up", phenix);
        shark.subscribe("up", stateHouse);
        shark.subscribe("up", newStock);
        shark.subscribe("down", stateHouse);
        shark.notifyUpdate("up", "Nvidia -> 5% increase");
        shark.notifyUpdate("down", "Tesla->-8%");



        shark.unsubscribe("up", newStock);

    }
}
