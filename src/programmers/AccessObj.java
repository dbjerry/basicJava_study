package programmers;

public class AccessObj {
	public int p = 3; //어떤 클래스든 접근가능(전체공개)
	protected int p2 = 4; //같은 패키지 혹은 상속받은 자식만
	int k = 2; //default 나랑 같은 패키지, 나 자신만 접근가능
	private int i = 1; //나 자신만 접근가능
}
