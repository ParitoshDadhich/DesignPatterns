package StrategyDesignPattern;

public class DebitCard implements ProcessPayment{
    @Override
    public void pay() {
        System.out.println("Processing payment via Debit card!");
    }
}
