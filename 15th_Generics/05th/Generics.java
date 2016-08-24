
interface Person<T> {
	public void setAge(T age);
	public T getAge();
}

class Student<T> implements Person<T> {
	T age;
	public void setAge(T age)
	{
		this.age = age;
	}
	public T getAge() {
		return this.age;
	}
}

class Student2 implements Person<String> {
	String age;
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getAge() {
		return this.age;
	}
}

public class Generics {
	public static void main(String args[]) {
		Student<Integer> s = new Student<Integer>();
		s.setAge(10);
		printInfo(s);

		Student2 s2 = new Student2();
		s2.setAge("11 years");
		printInfo(s2);

	}

	public static void printInfo(Person<?> p) {
		System.out.println(p.getAge());
	}

	
	public static <T> void printInfo2(Person<T> p) {
		System.out.println(p.getAge());
	}

}

