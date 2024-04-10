import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void openAccount() {
        System.out.println("Account opened successfully.");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void calInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest calculated: " + interest);
        balance += interest;
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;

    public FixedDepositAccount(String accountNumber, int termMonths) {
        super(accountNumber);
        this.termMonths = termMonths;
    }

    public void calInterest() {
        double interestRate = 6.0; 
        double interest = balance * interestRate * termMonths / 12 / 100;
        System.out.println("Interest calculated: " + interest);
        balance += interest;
    }
}

public class Practical4_q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter savings account number:");
        String savingAccountNumber = scanner.nextLine();
        System.out.println("Enter fixed deposit account number:");
        String fixedDepositAccountNumber = scanner.nextLine();

        System.out.println("Enter initial deposit amount for savings account:");
        double savingInitialDeposit = scanner.nextDouble();
        System.out.println("Enter initial deposit amount for fixed deposit account:");
        double fixedDepositInitialDeposit = scanner.nextDouble();

        SavingAccount savingAccount = new SavingAccount(savingAccountNumber, 3.5);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(fixedDepositAccountNumber, 12);

        savingAccount.openAccount();
        savingAccount.deposit(savingInitialDeposit);
        savingAccount.checkBalance();

        fixedDepositAccount.openAccount();
        fixedDepositAccount.deposit(fixedDepositInitialDeposit);
        fixedDepositAccount.checkBalance();

        scanner.close();
    }
}
