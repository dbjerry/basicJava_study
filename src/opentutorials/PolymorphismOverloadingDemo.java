package opentutorials;

class O{
    public void a(int param){ //int형 매개변수
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){ //String형 매개변수
        System.out.println("문자출력");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1); //int형 인자값
        o.a("one"); //String형 인자값
    }
}