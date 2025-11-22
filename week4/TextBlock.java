//JDK8_21Features
package week4;

public class TextBlock {
public static void main(String[] args) {
	String tb = """
			{
			status:success",
			"code:100"
			}
			""";
	System.out.println(tb);
}
}
