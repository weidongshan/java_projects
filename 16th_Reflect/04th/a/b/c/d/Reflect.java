

//import a.b.c.d.Person;

import java.lang.reflect.Constructor;

public class Reflect {
	public static void main(String args[]) throws Exception {
		Class<?> c = null;

		try {
			c = Class.forName("a.b.c.d.Person");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		Object p = null;

		try {
			p = c.newInstance();
		} catch (InstantiationException e) {
			System.out.println(e);
		}

		Constructor<?> con = c.getConstructor(String.class);
		Object p2 = con.newInstance("weidongshan");
		
	}
}

