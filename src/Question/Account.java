package Question;

public class Account {
    int balance;

    void deposit(int amount) {
       balance += amount;
    }

    void withdraw(int amout) {
        if(balance >= amout) {
            balance -= amout;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
