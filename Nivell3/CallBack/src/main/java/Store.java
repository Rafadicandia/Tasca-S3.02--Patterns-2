public class Store implements CallBack {
    private String name;

    public Store(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("✅ [Store: " + this.name + "] Callback received.");
    }
}
