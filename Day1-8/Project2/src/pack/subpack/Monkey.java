package pack.subpack;

public class Monkey extends Tiger implements Animal {
	public void eat() {
		super.eat();
		System.out.println("Banaenae");
	}
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eat();
		m.run();
		System.out.println(Animal.legs);
	}
}
