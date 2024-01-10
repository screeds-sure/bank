// Main.java

public class Main {
    public static void main(String[] args) {
        // Create accounts
        Account account1 = new Account(12345, 1000.0);
        Account account2 = new Account(67890, 2000.0);

        // Create a banking system
        BankingSystem bankingSystem = new BankingSystem();

        // Add accounts to the banking system
        bankingSystem.addAccount(account1);
        bankingSystem.addAccount(account2);

        // Perform transactions on accounts
        Transaction.performTransaction(account1, 500.0);
        Transaction.performTransaction(account2, 1000.0);

        // Display information about the banking system
        bankingSystem.displayAccounts();
    }
}
