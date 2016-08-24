
class Person {
	String name;
	int age;
	String getName() {
		return "guangdong "+name;
	}

	/* construct method */	
	public Person () {
		name = "null";
		age  = 0;
	}

	public Person (String name) {
		this.name = name;
	}

	public Person (String name, int age) {
		this.name = name;
		this.age  = age; 
	}
	
};


public class Oop3 {
	public static void main(String args[]) {
		Person p1 = new Person("zhangsan");
		Person p2 = new Person("lisi");
		Person p3 = new Person();
		Person p4 = new Person("wangwu", 6);

		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p4.getName());
	}
}

