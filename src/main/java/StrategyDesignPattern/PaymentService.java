package StrategyDesignPattern;

public class PaymentService {
    private ProcessPayment paymentStrategy;

    public void setPaymentStrategy(ProcessPayment paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(){
        this.paymentStrategy.pay();
    }
}
