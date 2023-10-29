package clientpack;

import devpack.PersistenceMechanism;

public class DatabaseSystem implements PersistenceMechanism
{
	private String dString;
	public void writeData(String ref)
	{
		dString = ref;
	}
	public String readData()
	{
		return dString;
	}
}
