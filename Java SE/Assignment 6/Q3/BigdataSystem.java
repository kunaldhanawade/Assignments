package clientpack;

import devpack.PersistenceMechanism;

public class BigdataSystem implements PersistenceMechanism
{
	private String bdString;
	public void writeData(String ref)
	{
		bdString = ref;
	}
	public String readData()
	{
		return bdString;
	}
}
