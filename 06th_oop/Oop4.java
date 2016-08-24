
class Person {

	static int count;
	
	String name;
	int age;
	String getName() {
		return "guangdong "+name;
	}

	/* construct method */	
	public Person () {
		count++;
		name = "null";
		age  = 0;
	}

	public Person (String name) {
		count++;
		this.name = name;
	}

	public Person (String name, int age) {
		count++;
		this.name = name;
		this.age  = age; 
	}

	static void printPerson () {
		System.out.println("This is a class of Person");
	}
	
};


public class Oop4 {
	public static void main(String args[]) {
		Person p1 = new Person("zhangsan");
		Person p2 = new Person("lisi");
		Person p3 = new Person();
		Person p4 = new Person("wangwu", 6);

		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());

		Person.printPerson();
		System.out.println(Person.count);
	}
}

