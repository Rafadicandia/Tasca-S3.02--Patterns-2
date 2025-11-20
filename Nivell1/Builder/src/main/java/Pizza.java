import java.util.ArrayList;

public class Pizza {
    private double size;
    private DoughType dough;
    private ArrayList<String> toppings;

    public Pizza(double size, DoughType dough, ArrayList<String> toppings) {
        if (size <= 0) {
            throw new RuntimeException("Size can't be less than 0 nor 0");
        }
        if (dough == null) {
            throw new RuntimeException("Select a doughType");
        }

        this.size = size;
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

//    public void setSize(double size) {
//        this.size = size;
//    }
//
//    public void setDough(DoughType dough) {
//        this.dough = dough;
//    }
//
//    public void setToppings(ArrayList<String> toppings) {
//        this.toppings.addAll(toppings);
//
//    }
//
//    public double getSize() {
//        return size;
//    }
//
//    public DoughType getDough() {
//        return dough;
//    }
//
//    public ArrayList<String> getToppings() {
//        return toppings;
//    }
}
