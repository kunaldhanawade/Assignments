/**
 * 
 */
package devpack;

/**
 * @author kunal
 * 
 */
public class Person {
	private String name;
	private int age;
	
	/**
	 * @param name
	 * @param age
	 * @throws VotingNotAllowedException
	 */
	public Person(String name, int age) throws VotingNotAllowedException {
		this.name = name;
		
		if(age>18)
			throw new VotingNotAllowedException();
		else
			this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name: "+name+" age: "+age+"]";
	}
}

