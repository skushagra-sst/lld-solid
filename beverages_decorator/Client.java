package beverages_decorator;

public class Client {

	public static void main(String[] args) {

		Beverage coffee = new Cappuccino();
		System.out.println("Coffee");
		System.out.println(coffee.cost());

		System.out.println("Coffee with milk");
		Beverage coffeeWithMilk = new MilkDecorator(coffee);
		System.out.println(coffeeWithMilk.cost());

		System.out.println("Coffee with milk and chocolate");
		Beverage coffeeWithMilkAndChocolate = new ChocolateDecorator(coffeeWithMilk);
		System.out.println(coffeeWithMilkAndChocolate.cost());

	}

}