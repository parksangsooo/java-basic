package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메소드 하나 :  deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("금액이 잘못 됨.");
        }
    }

    // public 메소드 : withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("금액이 잘못 됬거나 잔액이 부족함.");
        }
    }

    // getter 외부로 balance 를 보내줌.
    public int getBalance(){
        return balance;
    }

    private boolean isAmountValid(int amount){
        // 금액이 0 보다 커야함.
        return amount > 0;
    }
}
