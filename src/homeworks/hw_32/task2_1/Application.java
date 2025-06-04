package homeworks.hw_32.task2_1;

import java.math.BigDecimal;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.06.2025
 */

public class Application {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Alpha-Bank");

        System.out.println(bank);

        bank.withdrawMoney(500);

        bank.depositTransfer(10000);
        System.out.println(bank.checkBalance());

        ElectronicWallet wallet = new ElectronicWallet("Binance-w");

        System.out.println(wallet);

        wallet.withdrawMoney(100);

        wallet.depositTransfer(0.1);
        System.out.println(wallet);

        BankAccount bank2 = new BankAccount("Betta-Bank");

        System.out.println("===============\n");
        bank.transferMoney(5000, bank2);

        System.out.println("=================\n");
        bank.depositTransfer(100000);

        bank.transferMoney(75000, wallet);

        System.out.println(bank);
        System.out.println(wallet);

        System.out.println("=================\n");
        wallet.transferMoney(0.5, bank2);

        System.out.println(wallet);
        System.out.println(bank2);

        System.out.println("=================\n");

        ElectronicWallet wallet2 = new ElectronicWallet("Kraken");

        wallet2.transferMoney(1, wallet2);

        wallet.transferMoney(0.2, wallet2);
        System.out.println(wallet);
        System.out.println(wallet2);

        double x = 0.1 + 0.2;
        System.out.println(x);

        System.out.println(x == 0.3); // false

        BigDecimal amount = new BigDecimal("0.1");
        amount = amount.add(new BigDecimal("0.2"));

        System.out.println(amount);



    }
}
