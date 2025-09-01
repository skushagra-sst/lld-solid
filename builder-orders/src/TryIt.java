import com.example.orders.*;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("Folga ka Raita", 1, 269);
        OrderLine l2 = new OrderLine("Flying Maruti 800", 1, 69);
        Order o = new Order.Builder()
                .id("o2")
                .customerEmail("deeptalkswithvarundeep@rudra.app")
                .addLine(l1.getSku(), l1.getQuantity(), l1.getUnitPriceCents())
                .addLine(l2.getSku(), l2.getQuantity(), l2.getUnitPriceCents())
                .discountPercent(12)
                .build();
        System.out.println("Total after discount: " + o.totalAfterDiscount());
        System.out.println("Lines in order: " + o.getLines().size());
    }
}