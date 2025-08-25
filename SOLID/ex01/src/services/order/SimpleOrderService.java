package services.order;

import services.db.DataStore;
import services.email.EmailClient;
import services.tax.TaxCalculator;

public class SimpleOrderService implements OrderService {

    private TaxCalculator taxCalculator;
    private EmailClient emailClient;
    private DataStore dataStore;

    public SimpleOrderService(TaxCalculator taxCalculator, EmailClient emailClient, DataStore dataStore) {
        this.taxCalculator = taxCalculator;
        this.emailClient = emailClient;
        this.dataStore = dataStore;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = this.taxCalculator.calculate(subtotal);
        this.emailClient.send(customerEmail, "Thanks! Your total is " + total);
        this.dataStore.saveOrder(customerEmail);
    }
}