package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // 인터페이스 다중구현
        InterfaceA interfaceA = new Child();
        interfaceA.methodA();
        interfaceA.methodCommon();

        InterfaceB interfaceB = new Child();
        interfaceB.methodB();
        interfaceB.methodCommon();
    }
}
