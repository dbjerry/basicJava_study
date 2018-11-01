package programmers;

public abstract class Abstract_Bird {
	//메서드가 하나라도 추상메서드가 된다면 해당 클래스는 추상클래스가 된다.
	//클래스 앞에도 abstract 추상키워드를 입력
//	public abstract void sing();
	//abstract 추상메서드 키워드
	public void fly() {
		System.out.println("날다.");
	}
}
