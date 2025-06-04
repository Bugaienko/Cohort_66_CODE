package homeworks.hw_32.task2_1;

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
Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

public interface PaymentSystem {

    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    void transferMoney(double amount, PaymentSystem recipient);

    String getTitle();
    // Получение валюты счета
    String getCurrency();

    // Получение курса к базовой валюте
    double getCourseToEur();


}
