
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
		System.out.println(p.getAge());

		Person<Integer> p2 = new Person<Integer>();
		p2.setAge(3);
		System.out.println(p2.getAge());

	}
}

