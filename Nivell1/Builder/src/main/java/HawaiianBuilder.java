import java.util.ArrayList;

public class HawaiianBuilder implements PizzaBuilder {
    private double size;
    private DoughType dough;
    private ArrayList<String> toppings;


    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setDough(DoughType dough) {
        this.dough = dough;

    }

    @Override
    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;

    }

    @Override
    public Pizza getPizzaDone() {
        return new Pizza(size, dough,toppings);
    }
}
