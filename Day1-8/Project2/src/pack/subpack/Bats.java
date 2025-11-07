package pack.subpack;

public class Bats implements Animal,Bird {

	@Override
	public void eat() {
		System.out.println("Eats insects");
	}

	@Override
	public void run() {
		System.out.println("Runs slow");
	}

	@Override
	public void fly() {
		System.out.println("Flies fast");
	}
	public static void main(String[] args) {
		Bats b = new Bats();
		b.eat();
		b.run();
		b.fly();
	}

}
