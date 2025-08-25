package models;
public class Shipment {
    private String type;
    private double weightKg;

    Shipment(String type, double w) {
        this.type = type;
        this.weightKg = w;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

}