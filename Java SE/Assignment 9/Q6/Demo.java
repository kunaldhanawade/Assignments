import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) {
		
		Class c=null;
		
		try {
			c=Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method methods[] = c.getDeclaredMethods();
		
		for(Method i: methods)
			System.out.println(i);
	}
}
