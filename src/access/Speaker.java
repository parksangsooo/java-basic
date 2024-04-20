package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량 증가 불가. 최대 음량임.");
        } else {
            volume += 10;
            System.out.println("음량 +10");
        }
    }

    void volumeDown () {
        volume -= 10;
        System.out.println("음랑 -10");
    }

    void showInfo(){
        System.out.println("현재 음량: "+volume);
    }
}
