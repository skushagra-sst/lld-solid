package services;

public class ExpressShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double calculate(double weight) {
        return 80 + 8 * weight;
    }

}
