package homeworks.hw_32.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class EWallet implements PaySystem{

    private String title;
    private double balance;

    public EWallet(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }


    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            // Недостаточно денег для снятия
            return;
        }
        balance -= amount;
        System.out.printf("Электронный кошелек %s. Снято со счета %.2f\n",
                title, amount);

    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "EWallet {" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}
