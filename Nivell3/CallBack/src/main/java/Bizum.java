public class Bizum extends Payment {
    private String number;

    public Bizum(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Connecting phone number: " +getNumber());
    }
}
