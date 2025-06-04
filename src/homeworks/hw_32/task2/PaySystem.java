package homeworks.hw_32.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

/*
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
 */

public interface PaySystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
}
