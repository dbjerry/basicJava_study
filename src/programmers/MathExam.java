package programmers;

public class MathExam {
	public static void main(String[] args) {
		
		//5와 30중 가장 큰 값
		int value1 = Math.max(5, 30);//30
		System.out.println(value1);
		
		//5와 30중 가장 작은 값
		int value2 = Math.min(5, 30);//5
		System.out.println(value2);
		
		//절대값 출력
		System.out.println(Math.abs(-10));//10
		
		//랜덤메서드
		System.out.println(Math.random());
		
		//제곱근 구하는 메서드
		System.out.println(Math.sqrt(25));
		
	}
}
