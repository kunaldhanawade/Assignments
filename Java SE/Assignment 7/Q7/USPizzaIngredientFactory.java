public class USPizzaIngredientFactory implements PizzaIngredientFactory {
	private String dough = "all purpose flour";
	private String sauce = "tomato sauce";
	private String cheese = "parmessan";
	private String pepperoni = "pork";
	private String clams = "white clams";

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
