package homeworks.hw_32.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).

Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.

Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.

 */

public class BankApp {
    public static void main(String[] args) {

        PaySystem bank = new BankAcc("Bank1", 10000);
        PaySystem wallet = new EWallet("Wallet1", 5000);

        System.out.println(bank);
        bank.withdrawMoney(5000000);
        bank.withdrawMoney(500);
        System.out.println(bank.checkBalance());

        wallet.depositTransfer(10000);
        System.out.println(wallet.checkBalance());
        System.out.println(wallet);

    }
}















