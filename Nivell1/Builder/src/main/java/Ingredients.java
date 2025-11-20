import java.util.List;

public enum Ingredients {
    MARGARITA(List.of("Tomate", "Queso", "Albahaca")),
    PEPPERONI(List.of("Tomate", "Queso", "Pepperoni"));

    private final List<String> ingredientes;

    Ingredients(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredients() {
        return ingredientes;
    }


}
