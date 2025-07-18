package homeworks.hw_32.task2_1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public abstract class VisaMember implements PaymentSystem {

    private String title;
    private double balance;

    protected String currency;
    protected String typeAccount;

    public VisaMember(String title) {
        this.title = title;
    }

    // Снятие средств в "своей" валюте
    @Override
    public void withdrawMoney(double amount) {
        if (balance < amount) {
            System.out.printf("Недостаточно денег на счету для снятия %.2f %s (%s).",
                    amount, currency, title);
            return;
        }
        balance -= amount;
        System.out.printf("%s %s. Снято со счета %.2f %s\n",
                typeAccount, title, amount, currency);
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount < 0) return;

        balance += amount;
        System.out.printf("%s %s. Зачислено на счет %.2f %s\n",
                typeAccount, title, amount, currency);

    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s %s: balance= %.2f %s", typeAccount, title, balance, currency);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    public String getTypeAccount() {
        return typeAccount;
    }
}
