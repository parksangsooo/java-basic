package class1.ex;

public class ProductOrder {
    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price * quantity;
    }

    public void showInfo(){
        System.out.printf("상품명: %s, 가격: %,d, 수량: %d%n", productName, price, quantity);
    }
}
