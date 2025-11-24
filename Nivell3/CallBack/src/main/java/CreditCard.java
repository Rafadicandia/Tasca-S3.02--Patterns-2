public class CreditCard extends Payment{
    private String card;

    public String getCard() {
        return card;
    }


    @Override
    public void execute() {
        System.out.println("Sending info  to check credit card: " + getCard());
    }
}
