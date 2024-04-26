package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        // super();     // 상속받은 부모클래스에 기본생성자가 있어야 가능
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
