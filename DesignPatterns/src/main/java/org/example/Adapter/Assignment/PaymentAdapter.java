package org.example.Adapter.Assignment;

public class PaymentAdapter {
    int pay(int rupees){
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        return paymentProcessor.pay(rupees);
    }
}
