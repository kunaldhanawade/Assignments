package mypack;

public class Soldier {
	private Weapon weapon;

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	void perform() {
		weapon.attack();
	}
}
