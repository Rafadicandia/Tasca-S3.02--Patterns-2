import java.util.ArrayList;

public class MestrePizzer {

    public void builderHawaiianPizza(Builder builder){
        builder.setSize(30);
        builder.setDough(DoughType.REGULAR);
        builder.setToppings();
    }

//hawaiana
@Override
public void setToppings() {

    System.out.println("Adding toppings to hawaiian pizza");
    for (String s : topping) {
        System.out.println(s);

    }
}
}
