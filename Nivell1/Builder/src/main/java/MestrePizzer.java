import java.util.ArrayList;

public class MestrePizzer {

    public void builderMargarita(Builder builder){
        builder.setName("Margaritta");
        builder.setSize(30);
        builder.setDough(DoughType.REGULAR);
        builder.setToppings(Ingredients.MARGARITA);
    }

    public void builderPepperoni(Builder builder){
        builder.setName("Pepperoni");
        builder.setSize(40.6);
        builder.setDough(DoughType.NAPOLITAN);
        builder.setToppings(Ingredients.PEPPERONI);
    }

}
