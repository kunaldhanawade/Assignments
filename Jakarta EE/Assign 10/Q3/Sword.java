package mypack;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("Sword attack");
	}

}
