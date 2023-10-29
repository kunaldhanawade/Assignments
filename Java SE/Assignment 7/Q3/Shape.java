public abstract class Shape {
	public void show() {
		System.out.println("showing "+this.getClass().getName());
	}

	abstract void draw();

}
