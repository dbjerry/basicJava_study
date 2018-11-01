package programmers;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StringBufferExam2 {
	public static void main(String[] args) {
		
		String str1 = "hello world";
		//5번째부터 잘라서 str2가 가리킴.
		String str2 = str1.substring(5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		//겉으로는 문제없는 코드, 내부적으로는 문제있음
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		String str5 = "";
		
		//한 번 돌 때마다 객체 하나가 생성.
		//100번 돌았으니 객체가 100개 생성.
		for(int i = 0; i < 100; i++){
			str5 = str5 + "*";
		}
		System.out.println(str5);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++){
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		
	}
}
