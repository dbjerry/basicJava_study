package programmers;

public class WrapperExam {
	public static void main(String[] args) {
		
		int i = 5;
		//
		Integer i2 = new Integer(5);
		
		//autoBoxing
		Integer i3 = 5;
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		//java 5이전
		int i4 = i3.intValue();
		
		//java 5이후
		//unBoxing
		int i5 = i3;
		
	}
}
