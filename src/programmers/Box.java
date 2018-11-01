package programmers;

public class Box<E> {
	//Object 타입으로 obj라는 필드 생성
	private E obj;
	
	//이 필드에 값을 설정할 setter
	public void setObj(E obj){
		this.obj = obj;
	}
	
	//설정된 값을 반환할 수 있는 getter
	public E getObj(){
		return obj;
	}
	
}
