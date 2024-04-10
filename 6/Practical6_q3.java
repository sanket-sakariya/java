import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs " + amount + " successful.");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawal of Rs " + amount + " successful.");
    }

    public double getBalance() {
        return balance;
    }
}

public class Practical6_q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        try {
            System.out.print("Enter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter the amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.print("Enter another amount to withdraw: ");
            withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.print("Enter one more amount to withdraw: ");
            withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount); // This may throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final balance: Rs " + account.getBalance());

        scanner.close();
    }
}
