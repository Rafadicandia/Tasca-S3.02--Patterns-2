public class Main {
    public static void main(String[] args) {


        Store adidas = new Store("Adidas");
        Bizum bizumPayment = new Bizum("+34-634-330-718");
        bizumPayment.executeWith(adidas);


    }
}
