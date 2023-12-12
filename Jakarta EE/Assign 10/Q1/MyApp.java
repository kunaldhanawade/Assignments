package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("myconfig.xml");
		
		Soldier soldier = (Soldier) appContext.getBean("s1");
		soldier.perform();
	}

}
