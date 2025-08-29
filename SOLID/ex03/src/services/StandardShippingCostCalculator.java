package services;

public class StandardShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double calculate(double weight) {
        return 50 + 5 * weight;
    }

}
