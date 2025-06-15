package org.example.Adapter.Assignment;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public int pay(int dollars) {
        return dollars*80;
    }
}
