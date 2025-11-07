package outer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Calendar;

public class Demo1 {
	public static void main(String[] args) throws ParseException{
//		Date d = new Date();
//		System.out.println(d);
//		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		/*
		 Date d = new Date();
		String s=d.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String str= sdf.format(d);
		System.out.println(str);
		*/
		
		/*
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		*/
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);				//MM-dd-yyyy
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.minusDays(10));
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getMinute());
		System.out.println(lt.minusHours(10));
		
	}
}
