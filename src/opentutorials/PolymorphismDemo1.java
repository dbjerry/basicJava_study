package opentutorials;

class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x(); //부모의 객체 내에 있는 멤버들만 실행
        //obj.y();
    }
}