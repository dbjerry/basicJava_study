package programmers;

/**
 * @프로그래머스
 * @익명클래스
 */

public abstract class Action {
	public abstract void exec();
}


class MyAction extends Action{
	@Override
	public void exec() {
		System.out.println("exec");
	}
}

class ActionExam{
	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}
}