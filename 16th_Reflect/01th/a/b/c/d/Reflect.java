package a.b.c.d;

class Person {
	private String name;

	void setName(String name) { this.name = name; }
	String getName() { return this.name; }
	
};

public class Reflect {
	public static void main(String args[]) {
		Person p = new Person();
		Class<?> c1 = null;

		try {
			c1 = Class.forName("a.b.c.d.Person");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		Class<?> c2 = p.getClass();
		Class<?> c3 = Person.class;

		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
	}
}

