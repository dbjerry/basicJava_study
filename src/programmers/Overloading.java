package programmers;

public class Overloading {
	
	/*
		메서드 이름이 같아야 하고
		매개변수의 개수 또는 타입이 달라야한다.
	 */
	public int plus(int x, int y){
		return x + y;
	}
	public int plus(int x, int y, int z){
		return x + y + z;
	}
	public String plus(String x, String y){
		return x + y;
	}
	
	
	
	
	

}
