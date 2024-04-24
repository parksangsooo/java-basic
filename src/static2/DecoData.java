package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 정적 변수의 접근
        staticMethod(); // 정적 메서드 접근
//        instanceValue++;  // 인스턴스 변수 접근, 컴파일 에러 , 참조값을 몰라!! 어디로 가야하오..
//        instanceMethod();   // 인스턴스 메서드, 컴파일 에러
    }
    public void instanceCall(){
        staticValue++; // 정적 변수의 접근
        staticMethod(); // 정적 메서드 접근
        instanceValue++;  // 인스턴스 변수의 접근
        instanceMethod();   // 인스턴스 메서드 접근
    }
    public void instanceMethod(){
        System.out.println("instanceValue = "+ instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = "+ staticValue);
    }
}
