public class Main {
    public static void main(String[] args) {


        Store adidas = new Store("Adidas");
        Bizum bizumPayment = new Bizum("+34-634-330-718");
        CreditCard visa = new CreditCard("456-213-678-0987");
        bizumPayment.executeWith(adidas);
        visa.executeWith(adidas);


    }
}
