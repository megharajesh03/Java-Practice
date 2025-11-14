package Day15;

public class ex2 {

	/*
	public static String Validate(String day ) {
		switch(day) {
			case "monday" : System.out.println("Day 1 meet");break;
			case "tuesday": System.out.println("Day 2 meet");break;
			case "wednesday": System.out.println("Day 3 meet");break;
			default: System.out.println("Invalid day");
		}
		return day;
	}
	public static void main(String[] args) {
		System.out.println(ex2.Validate("tuesday"));
	}
	 */
	public static void main(String[] args) {

		String day = "Tuesday";
		String result= "";
		
//		result= switch(day) {
//			case "Monday":
//				yield result = "Day1 meet";
//			case "Tuesday": 
//				yield result = "Day2 meet";
//			case "Wednesday": 
//				yield result = "Day3 meet";
//			default:
//				yield result=("invalid day");
//		};
// 					OR
		
		result= switch(day) {
			case "Monday"-> "Day1 meet";
			case "Tuesday"-> "Day2 meet";
			case "Wednesday"->"Day3 meet";
			default->"invalid day";
		};
		System.out.println(result);
	}
}