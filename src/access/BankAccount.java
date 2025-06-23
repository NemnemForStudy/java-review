package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountIsValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    private boolean isAmountIsValid(int amount) {
        // 금액이 0보다 커야함.
        return amount > 0;
    }

    // public 메서드 : withDraw
    public void withdraw(int amount) {
        // 금액이 amount를 뺐을때 0이상이어야 합당함.
        if(isAmountIsValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
