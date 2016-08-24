
package a.b.c.d;

public class Person {
	public String name;

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public Person() {
		System.out.println("Constructor of Person");
	}
	public Person(String name) {
		this.name = name;
		System.out.println("Constructor2 of Person, name is "+this.name);
	}
};


