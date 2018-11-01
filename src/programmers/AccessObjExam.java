package programmers;

public class AccessObjExam /*extends AccessObj*/{
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
		System.out.println(obj.p2);
		//다른 패키지에서 불가능
		//extends로 상속받은 클래스에선 가능
		System.out.println(obj.k);
		//다른 패키지에서 불가능
//		System.out.println(obj.i);
		//private이라서 불가능
	}
}
