package oopsDemo_payment;

public class Client {
    public static void main(String[] args) throws Exception {
        PaymentService paymentService = new PaymentService();
        paymentService.addPayment("ParitoshCreditCard", new CreditCard("1234", "Paritosh Dadhich"));
        paymentService.addPayment("ParitoshUPI", new UPI("123"));

        paymentService.makePayment("ParitoshUPI");
        paymentService.makePayment("ParitoshCreditCard");
    }
}
