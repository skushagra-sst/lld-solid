package services;

import models.Payment;

public class UpiPaymentService implements PaymentService {

    public String pay(Payment p) {
        return "Paid via UPI: " + p.getAmount();
    }

}
