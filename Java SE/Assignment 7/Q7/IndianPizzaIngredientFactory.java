public class IndianPizzaIngredientFactory implements PizzaIngredientFactory {
	private String dough = "maida";
	private String sauce = "tomato and pizza spread";
	private String cheese = "mozrella";
	private String pepperoni = "chicken";
	private String clams = "clams";

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new Dough(dough);
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new Sauce(sauce);
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Cheese(cheese);
	}

	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new Pepperoni(pepperoni);
	}

	public Clams createClams() {
		// TODO Auto-generated method stub
		return new Clams(clams);
	}
}

