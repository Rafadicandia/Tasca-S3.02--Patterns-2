public class HawaiianBuilder implements PizzaBuilder{
    private Pizza hawaiianPizza;

    public HawaiianBuilder(Pizza hawaiianPizza) {
        this.hawaiianPizza = hawaiianPizza;
    }

    @Override
    public void setSize() {
        System.out.println("Setting size for hawaiian pizza");
    }

    @Override
    public void setDough() {
        System.out.println("Setting dough for hawaiian pizza");

    }

    @Override
    public void setToppings() {
        System.out.println("Adding toppings to hawaiian pizza");
        this.hawaiianPizza.

    }
}
