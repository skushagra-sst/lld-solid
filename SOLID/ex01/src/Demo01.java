import services.db.DataStore;
import services.db.SimpleDataStore;
import services.email.EmailClient;
import services.email.SimpleEmailClient;
import services.order.OrderService;
import services.order.SimpleOrderService;
import services.tax.SimpleTaxCalculator;
import services.tax.TaxCalculator;

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new SimpleTaxCalculator(0.18);
        EmailClient emailClient = new SimpleEmailClient();
        DataStore dataStore = new SimpleDataStore();
        OrderService orderService = new SimpleOrderService(taxCalculator, emailClient, dataStore);
        orderService.checkout("a@shop.com", 100.0);
    }
}
