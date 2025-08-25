package services.order;

public interface OrderService {
    public void checkout(String customerEmail, double subtotal);
}
