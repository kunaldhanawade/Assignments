package clientpack;

import devpack.PersistenceMechanism;

public class FileSystem implements PersistenceMechanism
{
	private String fString;
	public void writeData(String ref)
	{
		fString = ref;
	}
	public String readData()
	{
		return fString;
	}
}
