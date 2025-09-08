package beverages_decorator;

public class ChocolateDecorator extends Beverage {
    Beverage b;

    ChocolateDecorator(Beverage b) {
        this.b = b;
    }

    @Override
    public int cost() {
        return 10 + b.cost();
    }
}
