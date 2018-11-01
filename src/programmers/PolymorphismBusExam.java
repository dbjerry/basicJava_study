package programmers;

class Car {
	public void run(){
        System.out.println("Car의 run메소드");
	}
}

class Bus extends Car{
    public void ppangppang(){
        System.out.println("빵빵");
    }   
}

public class PolymorphismBusExam{
    public static void main(String args[]){
    	Car car = new Bus();
        car.run();
        //car.ppangppang(); //컴파일 오류 발생

        Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환
        bus.run();
        bus.ppangppang();
    }
}