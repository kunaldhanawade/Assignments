package clientpack;

import devpack.Vehicle;

public class TwoWheeler implements Vehicle
{
	private int gear;
	private int speed;
	private boolean brake;
	public void changeGear(int a)
	{
		System.out.println("changing two wheeler gear");
		if(a>0 && a<5)
			gear=a;
		else
			System.out.println("invalid entry");
	}
	public void speedUp(int a)
	{
		System.out.println("speeding two wheeler");
		if(a>0 && a<241)
			speed=a;
		else
			System.out.println("invalid entry");
	}
	public void applyBrakes(int a)
	{
		System.out.println("applying brake to two wheeler");
		if (a==0)
			brake=false;
		else if (a==1)
			brake=true;
		else
			System.out.println("invalid entry");
	}
}
