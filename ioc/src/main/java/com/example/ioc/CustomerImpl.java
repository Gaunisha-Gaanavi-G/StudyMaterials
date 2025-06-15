package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {
    CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }
    @Autowired //Setter level injection
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay() {
        creditCard.makePayment();
    }
}
