import java.util.ArrayList;

public interface PizzaBuilder {

    public void setSize(double size);
    public void setDough(DoughType dough);
    public void setToppings(Ingredients toppings);
    public Pizza getPizzaDone();

}
