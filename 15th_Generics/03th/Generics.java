
class Person<T> {
	private T age;

	public void setAge(T age) {
		this.age = age;
	}

	public T getAge() {
		return this.age;
	}
}

public class Generics {
	public static void main(String args[]) {
		Person<String> p = new Person<String>();
		p.setAge("3 years old");
		//System.out.println(p.getAge());
		printInfo(p);

		Person<Integer> p2 = new Person<Integer>();
		p2.setAge(3);
		//System.out.println(p2.getAge());
		printInfo(p2);

		Person<?> p3;

		p3 = p;
		//p3.setAge("4 years");
		p3.getAge();

		printInfo2(p);
		printInfo2(p2);
		printInfo2(p3);

	}

	public static void printInfo(Person<?> p) {
		System.out.println(p.getAge());
	}

	
	public static <T> void printInfo2(Person<T> p) {
		System.out.println(p.getAge());
	}

}

