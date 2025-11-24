public class Store implements CallBack{
    private String name;

    public Store(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("✅ [Store: " + this.name + "] Callback received.");
    }
}
