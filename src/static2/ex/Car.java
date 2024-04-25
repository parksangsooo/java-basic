package static2.ex;

public class Car {
    private String carName;
    private static int quantity = 0;

    public Car(String carName) {
        System.out.println("차량 구입, 이름: " + carName);
        quantity++;
        this.carName = carName;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량의 수: "+ quantity);
    }
}
