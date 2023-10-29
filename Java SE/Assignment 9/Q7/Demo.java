package clientpack;

public class Demo {

	static Object returnObject(String name) {
		
		Object ob = null;
		
		try {
			Class classDefinition = Class.forName(name);
			ob = classDefinition.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return ob;
	}
	
	public static void main(String[] args) {
		
		String objects[] = {
				"devpack.First",
				"devpack.Second",
				"devpack.Third",
				"devpack.Fourth"
		};
		
		for(String s: objects) {
			Object ob = returnObject(s);
			System.out.println(ob);
		}
	}
}

