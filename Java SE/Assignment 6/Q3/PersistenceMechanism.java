/**
 * 
 */
package devpack;

/**
 * @author Kunal
 *
 */
public interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}
