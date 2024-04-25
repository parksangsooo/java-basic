package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        //추가
        //인스턴스를 통한 접근
        // 권장하지 않음 인스턴스로 불른거라는 느낌이 듬
        DecoData data2 = new DecoData();
        data2.staticCall();
        
        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
