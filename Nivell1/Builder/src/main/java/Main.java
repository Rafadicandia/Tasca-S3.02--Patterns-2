public class Main {
    public static void main(String[] args) {

        MestrePizzer cheff = new MestrePizzer();

        Builder builder = new Builder();

        cheff.builderMargarita(builder);

        Pizza margarita = builder.getPizzaDone();


    }
}
