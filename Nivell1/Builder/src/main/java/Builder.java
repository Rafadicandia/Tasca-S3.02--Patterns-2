import java.util.ArrayList;

public class Builder implements PizzaBuilder {
    private String name;
    private double size;
    private DoughType dough;
    private Ingredients toppings;


    @Override
    public void setName(String name) {
        this.name = name;
    }

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
        System.out.println("Your "+name+ " pizza is ready!"
                + "\n"
                +"Size: "+size
                +"\n"
                +"Dough: "+dough
                +"\n"
                +"Toppings: "+toppings.getIngredients()
        );
        return new Pizza(name, size, dough,toppings);

    }
}
