public class Pizza {
    private String name;
    private double size;
    private DoughType dough;
    private Ingredients toppings;

    public Pizza(String name, double size, DoughType dough, Ingredients toppings) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Assign a name");
        }
        if (size <= 0) {
            throw new RuntimeException("Size can't be less than 0 nor 0");
        }

        if (dough == null) {
            throw new RuntimeException("Select a doughType");
        }
        this.name = name;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

}
