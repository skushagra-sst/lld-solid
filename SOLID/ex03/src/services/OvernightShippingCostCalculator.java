package services;

public class OvernightShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double calculate(double weight) {
        return 120 + 10 * weight;
    }

}
