package homeworks.hw_32.task2_1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class BankAccount extends VisaMember{

    public BankAccount(String title) {
        super(title);
        currency = "EUR";
        typeAccount = "Bank";

    }

    /*
    Вывод средств - сумма которую переводим - всегда в валюте нашего счета.
    Проверяем валюту счета получателя. Получаем курс пересчета.
    Вычисляем сумму к зачислению в валюте получателя.
    Отправляем получателю сумму в валюте счета получателя.
     */

    // 100000 E -> ? BTC | 1 BTC | + 1 BTC


    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > checkBalance()) {
            System.out.printf("Недостаточно средств (%s)! Transfer %.2f | balance: %.2f\n",
                    getTitle(), amountEur, checkBalance());
            return; // false
        }
//
//        if (recipient.getCurrency().equals("EUR")) {
//            // переводим на евровый счет (конвертация не нужна)
//            withdrawMoney(amountEur);
//            recipient.depositTransfer(amountEur);
//            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR завершен\n",
//                    getTitle(), recipient.getTitle(), amountEur);
//            return; // true
//        }
//
//        if (recipient.getCurrency().equals("BTC")) {
            // Конвертировать евро в валюту получателя.
            // EUR -> BTC

            double amountRecipient = amountEur / recipient.getCourseToEur();
            withdrawMoney(amountEur);
            recipient.depositTransfer(amountRecipient);
            System.out.printf("Успех! Перевод (%s -> %s) %.4f %s -> %.5f %s  завершен\n",
                    getTitle(), recipient.getTitle(), amountEur, getCurrency(), amountRecipient, recipient.getCurrency());

//        }
    }

    @Override
    public double getCourseToEur() {
        return 1;
    }
}
