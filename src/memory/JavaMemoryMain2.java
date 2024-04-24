package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("메인 스타트");
        method1();
        System.out.println("메인 종료");
    }

    static void method1() {
        System.out.println("메서드1 스타트");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("메서드1 종료");
    }

    private static void method2(Data data2) {
        System.out.println("메서드2 스타트");
        System.out.println("data.value= " + data2.getValue());
        System.out.println("메서드2 종료");
    }
}
