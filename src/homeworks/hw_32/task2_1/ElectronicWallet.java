package homeworks.hw_32.task2_1;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class ElectronicWallet extends VisaMember {

    public ElectronicWallet(String title) {
        super(title);
        currency = "BTC";
        typeAccount = "CryptoWallet";
    }

    // Можно (и нужно) тоже вынести в абстрактный класс
    @Override
    public void transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > checkBalance()) {
            System.out.printf("Недостаточно средств (%s)! Transfer %s: %.2f | balance: %.2f\n",
                    getTitle(), getCurrency(), amountBtc, checkBalance());
            return; // false
        }

        // Сумма перевода в евро
        double amountEur = amountBtc * getCourseToEur();

        // Сумму перевода в валюте получателя
        double amountRecipient = amountEur / recipient.getCourseToEur();

        withdrawMoney(amountBtc);
        recipient.depositTransfer(amountRecipient);
        System.out.printf("Успех! Перевод (%s -> %s) %.4f %s -> %.5f %s  завершен\n",
                getTitle(), recipient.getTitle(), amountBtc, getCurrency(), amountRecipient, recipient.getCurrency());
    }

    @Override
    public double getCourseToEur() {
        // Какой-то сложный механизм, получает текущий курс с сервера анка
        // или биржи
        return 100_000;
    }
}
