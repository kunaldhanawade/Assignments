package mypack;

public class Soldier {
	private Weapon weapon;

	public Soldier(Weapon weapon) {
		this.weapon = weapon;
	}
	
	void perform() {
		weapon.attack();
	}
}
