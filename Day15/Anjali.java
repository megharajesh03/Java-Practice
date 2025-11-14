package Day15;

sealed class Human permits Manish,  Anjali{
	public void printName() {
		System.out.println("Default");
	}
}

non-sealed class Manish extends Human{
	public void printName() {
		System.out.println("Manish sharma");
	}
}

final class Anjali extends Human {
	public void printName() {
		System.out.println("Anjali Redy");
	}
}
