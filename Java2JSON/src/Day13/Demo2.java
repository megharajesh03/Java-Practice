package Day13;
//Serialization and Deserialization
import java.io.*;

public class Demo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeBean eb = new EmployeeBean(101,"Vi",65000);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\DemoFolder\\demo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eb);

		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\DemoFolder\\demo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeBean e =(EmployeeBean)ois.readObject();
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());

	}
}
