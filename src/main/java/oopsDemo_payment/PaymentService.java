package oopsDemo_payment;

import java.util.HashMap;

/*
I need not to add if else statement for checking -> which payment method and do perticular operation
If I do so then I would violte ocp principle

with my current impl, I can just add another class for ex paypal and implements paymentMethod and add it to paymentService.
With this way I will never change the code of PaymentService;
 */

public class PaymentService {
    // STORING payment method and make payment
    HashMap<String, PaymentMethod> paymentService;

    PaymentService(){
        paymentService = new HashMap<>();
    }

    public void addPayment(String paymentId, PaymentMethod paymentMethod){
        paymentService.put(paymentId, paymentMethod);
    }

    public void makePayment(String paymentId) throws Exception {
        if(paymentService.containsKey(paymentId)){
            PaymentMethod paymentMethod = paymentService.get(paymentId);
            paymentMethod.pay();
        }
        else
            throw new Exception("Invalid Payment method!");
    }
}
