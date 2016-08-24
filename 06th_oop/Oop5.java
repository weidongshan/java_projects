
class Person {

	static int count;
	
	String name;
	int age;
	String getName() {
		return "guangdong "+name;
	}

	static {
		System.out.println("static block");		
	}

	{
		System.out.println("construct block");
		count ++;
	}

	/* construct method */	
	public Person () {
		System.out.println("construct method: Person 1");
		name = "null";
		age  = 0;
	}

	public Person (String name) {
		System.out.println("construct method: Person 2");
		this.name = name;
	}

	public Person (String name, int age) {
		System.out.println("construct method: Person 3");
		this.name = name;
		this.age  = age; 
	}

	static void printPerson () {
		System.out.println("This is a class of Person");
	}
	
};


public class Oop5 {
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

