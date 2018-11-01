package programmers;

public class InnerExam1 {
	class Cal1{
		int value1 = 0;
		public void plus1(){
			value1++;
		}
	}
	
	static class Cal2{
		int value2 = 0;
		public void plus2(){
			value2++;
		}
	}
	
	class Cal3{
		public void exec(){
			class Cal4{
				int value3 = 0;
				public void plus3(){
					value3++;
				}
			}
			Cal4 cal4 = new Cal4();
			cal4.plus3();
			System.out.println(cal4.value3);
		}
		
	}
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal1 cal1 = t.new Cal1();
		cal1.plus1();
		System.out.println(cal1.value1);
		
		InnerExam1.Cal2 cal2 = new InnerExam1.Cal2();
		cal2.plus2();
		System.out.println(cal2.value2);
		
		InnerExam1.Cal3 cal3 = t.new Cal3();
		cal3.exec();
		
	}
	
}

