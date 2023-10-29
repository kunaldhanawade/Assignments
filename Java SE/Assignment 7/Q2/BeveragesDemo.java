public class BeveragesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverages bev[] = new Beverages[3];

		bev[0] = new Coffee();
		bev[1] = new Tea();
		bev[2] = new FruitJuice();
		
		for(int i=0; i<bev.length; i++) {
			bev[i].addMilk();
			bev[i].addIngredients();
			System.out.println();
		}
	}

}

