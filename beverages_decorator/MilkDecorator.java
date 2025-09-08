package beverages_decorator;

public class MilkDecorator extends Beverage {
    Beverage b;

    MilkDecorator(Beverage b) {
        this.b = b;
    }

    @Override
    public int cost() {
        return 5 + b.cost();
    }

}
