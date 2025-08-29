import models.Shipment;
import models.ShipmentType;

public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(ShipmentType.EXPRESS, 2.0);
        System.out.println(shipment.getCost());
    }
}
