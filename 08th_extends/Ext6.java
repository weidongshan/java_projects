abstract class Father {
	private int money;	

	public int getMoney() {return money; }
	public void setMoney(int money) {this.money = money; }

	public abstract void study();
}

class Son extends Father{
	public void study() {System.out.println("I am study"); }
	
}

public class Ext6 {
	public static void main (String args[]) {
		//Father f = new Father();
		Son son = new Son();
		son.study();

	}
}

