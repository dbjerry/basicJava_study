package opentutorials;

class MultiplyCalc extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class Inheritnace_MultiplyCalc {
	public static void main(String[] args) {
		
		MultiplyCalc c1 = new MultiplyCalc();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}
}