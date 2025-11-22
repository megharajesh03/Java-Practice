//JDK8_21Features
package week4;

public class Switch {
	public static void main(String[] args) {
		
String day = "Monday";
String type = switch(day) {
case "Monday","Tuesday","Wednesday","Thursday","Friday"->"WeekDay";
case "Saturday","Sunday"->"WeekEnd";
default->"Invalid";
};
System.out.println(type);
}
}