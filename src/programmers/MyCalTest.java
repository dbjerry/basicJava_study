package programmers;

public class MyCalTest{
	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		cal.plus(5, 6);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		Calculator.exec2(3, 4);
		//interface에서 static으로 구현하면 메서드명. 으로 호출해야함.
		System.out.println(Calculator.exec2(3, 4));
		
	}
	
}


class MyCal implements Calculator{
	
	@Override
	public int plus(int i, int j) {
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		return i * j;
	}

}