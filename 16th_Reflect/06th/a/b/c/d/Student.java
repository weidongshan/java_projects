
package a.b.c.d;

public class Student {
	public String name;

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public Student() {
		System.out.println("Constructor of Student");
	}
	public Student(String name) {
		this.name = name;
		System.out.println("Constructor2 of Student, name is "+this.name);
	}
};


