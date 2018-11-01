package programmers;

public class BoxExam {
	public static void main(String[] args) {
		
//		Box box = new Box();
//		
//		//위 Box에다가 값을 넣을 setter
//		box.setObj(new Object());
//		
//		//설정된 값을 꺼낼 getter
//		Object obj = box.getObj();
//		
//		//값이 설정될 땐 String타입이지만
//		box.setObj("Hello");
//		//반환받을 땐 Object타입
//		//Object타입으로 자식들을 다 가리킬 순 있으나
//		//자식이 가진 메서드에는 접근 할 수 없다.
//		// ㄴ 형변환
//		String str = (String)box.getObj();
//		System.out.println(str);
//
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		Box<Object> box = new Box<>();
		
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();		
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		
	}
}
