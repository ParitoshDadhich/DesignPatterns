package oopsDemo_payment;

public class DebitCard extends Card implements PaymentMethod{
    DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card " + this.getCardNo());
        System.out.println("Username: " + this.getUserName());
    }
}
