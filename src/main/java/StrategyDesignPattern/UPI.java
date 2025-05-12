package StrategyDesignPattern;

public class UPI implements ProcessPayment{
    @Override
    public void pay() {
        System.out.println("Processing payment via UPI");
    }
}
