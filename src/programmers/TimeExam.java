package programmers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
	public static void main(String[] args) {
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println("1) " + timePoint);					//1
		
		LocalDate ld1= LocalDate.of(2012, 12, 12);
		System.out.println("2) " + ld1);						//2
		
		LocalTime lt1 = LocalTime.of(17,18);
		System.out.println("3) " + lt1);						//3
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println("4) " + lt2);						//4
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println("5) " + theDate);					//5
		
		Month month = timePoint.getMonth();
		System.out.println("6) " + month.getValue());			//6
		System.out.println("7) " + timePoint.getMonthValue());	//7
		System.out.println("8) " + timePoint.getMonth());		//8
		
		System.out.println("9) " + timePoint.getHour());		//9
		
		
		
		
	}
}
