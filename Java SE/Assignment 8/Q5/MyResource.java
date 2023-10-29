/**
 * 
 */
package devpack;

/**
 *  @author Kunal
 * 
 */
public class MyResource implements AutoCloseable {
	
	public MyResource(int capacity) throws ResourceNotAllocatedException {
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
	
    public void disp() {
    	System.out.println("successful");
    }

	public void close() {
		System.out.println("resource is closed");
	}
}
