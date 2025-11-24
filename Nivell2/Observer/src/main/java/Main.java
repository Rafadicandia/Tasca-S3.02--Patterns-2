public class Main {
    public static void main(String[] args) {
        Agency phenix = new Agency("Phenix Stocks");
        Agency stateHouse = new Agency("State House");



        Broker shark = new Broker("up", "down");
        shark.subscribe("up", phenix);
        shark.subscribe("up", stateHouse);
        shark.subscribe("down", stateHouse);
        shark.notifyUpdate("up", "Nvidia -> 5% increase");
        shark.notifyUpdate("down", "Tesla->-8%");
    }
}
