package clientpack;

import devpack.Vehicle;

public class FourWheeler implements Vehicle
{
	private int gear;
	private int speed;
	private boolean brake;
	public void changeGear(int a)
	{
		System.out.println("changing four wheeler gear");
		if(a>0 && a<6)
			gear=a;
		else
			System.out.println("invalid entry");
	}
	public void speedUp(int a)
	{
		System.out.println("speeding four wheeler");
		if(a>0 && a<241)
			speed=a;
		else
			System.out.println("invalid entry");
	}
	public void applyBrakes(int a)
	{
		System.out.println("applying brake to four wheeler");
		if (a==0)
			brake=false;
		else if (a==1)
			brake=true;
		else
			System.out.println("invalid entry");
	}
}
