package oopsDemo_payment;

public class CreditCard extends Card implements PaymentMethod{

    CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card " + this.getCardNo());
        System.out.println("Username: " + this.getUserName());
    }
}
