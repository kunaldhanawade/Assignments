public class Demo {

	public static void main(String[] args) {
		
		Artist art[] = new Artist[3];
		art[0] = new Actor();
		art[1] = new Singer();
		art[2] = new Musician();
		
		for(int i=0; i<art.length; i++) {
			art[i].perform();
			if(art[i] instanceof Actor) {
				Actor a = (Actor) art[i];
				a.changeGetUp();
			}
			System.out.println();
		}
	}
}


