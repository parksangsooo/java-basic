package poly.basic;

// Upcasting vs Downcasting
public class CastingMain2 {
    public static void main(String[] args) {

        Child c = new Child();
        Parent parent = (Parent) c; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent1 = c;
        parent1.parentMethod();
        parent.parentMethod();

    }

}
