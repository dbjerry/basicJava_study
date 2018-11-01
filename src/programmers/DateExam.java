package programmers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime());
		
		long today = System.currentTimeMillis();
		System.out.println(today);
		System.out.println(today - date.getTime());
		
		System.out.println(ft.format(today));
		
		
		
		
		
		
		
	}
}
