// Transaction.java

public class Transaction {
    public static void performTransaction(Account account, double amount) {
        System.out.println("Performing transaction on account " + account.getAccountNumber() + ":");
        account.deposit(amount);
        account.withdraw(amount / 2);
        account.display();
    }
}
