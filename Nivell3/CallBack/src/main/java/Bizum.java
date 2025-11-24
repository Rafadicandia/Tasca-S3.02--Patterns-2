public class Bizum extends Payment {
    private String number;

    public Bizum(String number) {
        if(number==null || number.isBlank()){
            throw new RuntimeException("You must set a number in order to pay by Bizum");
        }
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
