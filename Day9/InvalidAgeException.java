package Day9;

public class InvalidAgeException extends Exception {
	int age;
	
	public InvalidAgeException(int age) {
		this.age =age;
	}

	@Override
	public String toString() {
		return "InvalidAgeException [age=" + age + "]";
	}
	

}

