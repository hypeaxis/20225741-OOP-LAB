public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 50000;
    private static final double WITHDRAWAL_FEE = 5000;


    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        // Ensure initial balance is not less than minimum
        this.balance = Math.max(initialBalance, MINIMUM_BALANCE); 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
             if (this.balance - amount - WITHDRAWAL_FEE >= MINIMUM_BALANCE ) {
                this.balance -= (amount + WITHDRAWAL_FEE);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
