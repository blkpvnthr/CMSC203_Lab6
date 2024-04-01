package application;

public class SavingsAccount extends BankAccount {
    private double rate = 0.025; // 2.5%
    private static int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
