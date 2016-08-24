

public class Hello {
    private String name;
    private int age;
    
	public static void main(String args[]) {
		System.out.println("Hello, world!");
	}

    public int sayhello_to(String name) {
		System.out.println("Hello, "+name+"! I am "+this.name+", "+age+" years old.");       
        return 123;
    }

    public static void sayhello_to() {
    }
}

