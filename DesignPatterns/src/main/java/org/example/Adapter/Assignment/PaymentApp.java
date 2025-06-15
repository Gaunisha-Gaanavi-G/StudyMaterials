package org.example.Adapter.Assignment;

public class PaymentApp {
    public void pay(int rupees){
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        int amount = paymentAdapter.pay(rupees);
        System.out.println("Amount paid: " + amount);
    }
}
