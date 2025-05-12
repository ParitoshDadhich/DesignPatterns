package StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.makePayment();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.makePayment();

        paymentService.setPaymentStrategy(new UPI());
        paymentService.makePayment();
    }
}
