package OOP.Java_58;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		long time =  System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("test");
		}
		long time2 = System.currentTimeMillis();
		
		
		System.out.println("truoc khi chay for" + time);
		System.out.println("sau khi chay for" + time2);
		System.out.println("tong thoi gian " + (time2 - time) + " milisecond");
		
		// time unit 
		System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365) + "s");
		System.out.println("1hour = " + TimeUnit.HOURS.toMinutes(1) + "Minutes");
		
		
		// Date sql
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
		System.out.println(d.getDate() + "-" + (d.getMonth()+1) + "-" + (d.getYear()+1900));
		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) +  "-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 13);
		System.out.println(c.get(Calendar.HOUR) + "H " + c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) +  "-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 7);
		System.out.println(c.get(Calendar.HOUR) + "H " + c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) +  "-" + c.get(Calendar.YEAR));
		
		
		// Date format
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(df.format(d));
		
		
		
	}
}
