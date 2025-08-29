package models;

public class Shipment {
    private double weightKg;
    private ShipmentType shipmentType;

    public Shipment(ShipmentType shipmentType, double w) {
        this.weightKg = w;
        this.shipmentType = shipmentType;
    }

    public double getCost() {
        return this.shipmentType.getCalculator().calculate(weightKg);
    }

    public ShipmentType getShipmentType() {
        return this.shipmentType;
    }

    public void setType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

}