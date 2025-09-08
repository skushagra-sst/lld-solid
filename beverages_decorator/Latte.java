package beverages_decorator;

public class Latte extends Beverage {
	Beverage b ;
	//use composition 
	Latte(){
		b = this;
	}
	@Override
	public int cost() {
		return 20;
	}

}