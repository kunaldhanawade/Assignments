package weaponpack;

public class Soldier {

	void fight(Weapon w) {
		if (w instanceof Gun) {
			Gun g = (Gun) w;
			g.fillBullets();
		}
		w.attack();
	}
}
