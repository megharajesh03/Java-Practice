package pack.subpack;

public class Peacock implements Bird {

	@Override
	public void eat() {
		System.out.println("Eats flowers?");
	}

	@Override
	public void fly() {
		System.out.println("Flies fast");
	}
	public static void main(String[] args) {
		Peacock p = new Peacock();
		p.eat();
		p.fly();
	}

}
