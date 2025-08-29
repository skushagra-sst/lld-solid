package services;

import models.Payment;

public class CardPaymentService implements PaymentService {

    public String pay(Payment p) {
        return "Paid via Card: " + p.getAmount();
    }

}
