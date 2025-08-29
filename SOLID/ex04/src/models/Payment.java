package models;

public class Payment {
    private PaymentType provider;
    private double amount;

    Payment(PaymentType p, double a) {
        this.provider = p;
        this.amount = a;
    }

    public PaymentType getProvider() {
        return provider;
    }

    public void setProvider(PaymentType provider) {
        this.provider = provider;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    

}