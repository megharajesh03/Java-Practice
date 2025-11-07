package pack.subpack;

public class Tiger implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Only non");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runs fast");	
	}
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.run();
		System.out.println(Animal.legs);
	}

}
