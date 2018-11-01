package opentutorials;

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}


class Substraction extends Calculator {
	public void substract() {
		System.out.println(this.left-this.right);
	}
}


public class Inheritance_Calculator {
	 public static void main(String[] args) {
         
		 Substraction c1 = new Substraction();
	        c1.setOprands(10, 20);
	        c1.sum();       
	        c1.avg();  
	          
	        Calculator c2 = new Calculator();
	        c2.setOprands(20, 40);
	        c2.sum();       
	        c2.avg();
	    }
}
