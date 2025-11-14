package Day15;

public class Ex {
	/*
	public static void main(String[] args) {
		String str = """
				Java is a programming language.
				Its a multithreaded programming language.
				And it is platform independent.
				""";
		System.out.println(str);
	}
	*/
	record Employee(int empid, String empname) {
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee (101,"Karthik");
		Employee e2 = new Employee (101,"Karthik");
		System.out.println(e1.equals(e2));
	}
}
