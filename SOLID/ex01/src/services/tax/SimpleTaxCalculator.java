package services.tax;

public class SimpleTaxCalculator implements TaxCalculator {

    private double taxRate;

    public SimpleTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculate(double amount) {
        return amount + (amount * taxRate);
    }

}
