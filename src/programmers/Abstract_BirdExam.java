package programmers;

public class Abstract_BirdExam {
	public static void main(String[] args) {
		Abstract_Duck duck = new Abstract_Duck();
		duck.sing();
		duck.fly();
		
//		Bird b = new Bird();
//		추상클래스는 부모로서의 역할은 가능하지만
//		추상클래스 자체를 이용해서 객체를 만들 수는 없다.
	}
}
