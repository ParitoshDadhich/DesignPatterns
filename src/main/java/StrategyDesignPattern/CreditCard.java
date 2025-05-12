package StrategyDesignPattern;

public class CreditCard implements ProcessPayment {
    @Override
    public void pay() {
        System.out.println("Processing payment via Credit card!");
    }
}
