class Father {
	private int money;	

	public int getMoney() {return money; }
	public void setMoney(int money) {this.money = money; }

	public void printInfo() {System.out.println("This is Father");}

}

class Son extends Father{
	public void printInfo() {System.out.println("This is son");}
	public void playGame() {System.out.println("playGame ...");}
	
}

class Daughter extends Father{
	public void printInfo() {System.out.println("This is daughter");}

	
}

public class Cnv2 {
	public static void main (String args[]) {
		Father f = new Son();
		Son son = (Son)f;   /* Son son = new Son(); */
	}
}

