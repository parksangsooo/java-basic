package class1.ex;

import java.util.ArrayList;

public class ProductOrderMain {
    public static void main(String[] args) {
        ArrayList<ProductOrder> data = new ArrayList<>();
        data.add(new ProductOrder("두부", 2000, 2));
        data.add(new ProductOrder("김치", 5000, 1));
        data.add(new ProductOrder("콜라", 1500, 2));

        int totalPrice = 0;

        for (ProductOrder product : data){
            product.showInfo();
            totalPrice += product.getPrice();
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}