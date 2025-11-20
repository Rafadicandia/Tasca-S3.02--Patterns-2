import java.util.ArrayList;

public class Pizza {
    private double size;
    private DoughType dough;
    private Ingredients toppings;

    public Pizza(double size, DoughType dough, Ingredients toppings) {
        if (size <= 0) {
            throw new RuntimeException("Size can't be less than 0 nor 0");
        }
        if (dough == null) {
            throw new RuntimeException("Select a doughType");
        }

        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

}
