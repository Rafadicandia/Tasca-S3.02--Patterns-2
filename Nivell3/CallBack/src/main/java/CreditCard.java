public class CreditCard extends Payment{
    private String card;

    public CreditCard(String card) {
        if(card==null || card.isBlank()){
            throw new RuntimeException("You must set a credit card number");
        }
        this.card = card;
    }

    public String getCard() {
        return card;
    }


    @Override
    public void execute() {
        System.out.println("Sending info  to check credit card: " + getCard());
    }
}
