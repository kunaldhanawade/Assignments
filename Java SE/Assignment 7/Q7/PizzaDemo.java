public class PizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaIngredientFactory pif[] = new PizzaIngredientFactory[2];
		
		pif[0] = new USPizzaIngredientFactory();
		pif[1] = new IndianPizzaIngredientFactory();
		
		for(int i=0; i<pif.length; i++) {
			System.out.println(pif[i].getClass().getName());
			System.out.println("\t"+pif[i].createDough());
			System.out.println("\t"+pif[i].createSauce());
			System.out.println("\t"+pif[i].createCheese());
			System.out.println("\t"+pif[i].createPepperoni());
			System.out.println("\t"+pif[i].createClams());
			System.out.println();
		}
	}
}

