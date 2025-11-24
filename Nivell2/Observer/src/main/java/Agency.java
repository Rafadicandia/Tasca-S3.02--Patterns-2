public class Agency implements EventListener {
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void updateStock(String message) {
        System.out.println(name + " agency just received this stock update: " + message);

    }
}
