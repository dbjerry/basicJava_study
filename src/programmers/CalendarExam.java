package programmers;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//Calendar는 추상클래스이고 getInstance할 시 Calendar를
		//상속받는 자식클래스들이 같이 호출된다.
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		//java는 0월부터 출력이 되기 때문에 +1을 해야 현재 월을 출력한다.
		
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
		
		//현재시간 +5시간을 기준으로 잡는다.
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		
		
	}
}
