interface Game {
	void play();
}

class Cricket implements Game {
	public void play() {
		System.out.println("playing Cricket");
	}
}

class Football implements Game {
	public void play() {
		System.out.println("playing Football");
	}
}

class Tennis implements Game {
	public void play() {
		System.out.println("playing Tennis");
	}
}

public class Demo {
	
	public static void perform(Game g) {
		g.play();
	}
	
	public static void main(String[] args) {
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}
}
