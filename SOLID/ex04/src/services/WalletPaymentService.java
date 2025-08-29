package services;

import models.Payment;

public class WalletPaymentService implements PaymentService {

    public String pay(Payment p) {
        return "Wallet debit: " + p.getAmount();
    }

}
