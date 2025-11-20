import java.util.ArrayList;

public class Builder implements PizzaBuilder {
    private double size;
    private DoughType dough;
    private Ingredients toppings;


    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setDough(DoughType dough) {
        this.dough = dough;

    }

    @Override
    public void setToppings(Ingredients toppings) {
        this.toppings = toppings;

    }

    @Override
    public Pizza getPizzaDone() {
        return new Pizza(size, dough,toppings);
    }
}
