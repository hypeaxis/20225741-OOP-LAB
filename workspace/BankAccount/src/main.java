
public class main {

    public static void main(String[] args) {

        testNormalAccountDeposit();
        testNormalAccountWithdraw();
        testSavingAccountInterest();
        testSavingAccountNoWithdraw();

    }

    public static void testNormalAccountDeposit() {
        BankAccount account = new BankAccount("User", "123", 50000);
        account.deposit(10000);
        System.out.println("Normal Account Deposit: Expected 60000, Actual: " + account.getBalance());
    }

    public static void testNormalAccountWithdraw() {
        BankAccount account = new BankAccount("User", "123", 70000);
        account.withdraw(10000);
        System.out.println("Normal Account Withdraw: Expected 55000, Actual: " + account.getBalance());
    }

    public static void testSavingAccountInterest() {
        SavingAccount account = new SavingAccount("User", "456", 100000, 0.05);
        double expectedInterest = 100000 * 0.05 / 12;
        double actualInterest = account.calculateMonthlyInterest();
        System.out.println("Saving Account Interest: Expected " + expectedInterest + ", Actual: " + actualInterest);

    }

    public static void testSavingAccountNoWithdraw() {
        SavingAccount account = new SavingAccount("User", "456", 100000, 0.05);
        account.withdraw(10000);  // Should have no effect
        System.out.println("Saving Account No Withdraw: Expected 100000, Actual: " + account.getBalance());
    }
}