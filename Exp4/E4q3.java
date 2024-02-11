package Exp4;
// Account class
class Account {
    String accountNumber;
    double balance;
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class, derived from Account
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }

    // Override the displayInfo method to include interest rate
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CurrentAccount class, derived from Account
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override the withdraw method to include overdraft limit check
    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    // Override the displayInfo method to include overdraft limit
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

// Bank class
class Bank {
    Account[] accounts;
    Bank(int capacity) {
        accounts = new Account[capacity];
    }

    void openAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("Account opened successfully!");
                return;
            }
        }
        System.out.println("Bank is full. Cannot open more accounts.");
    }

    void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].accountNumber.equals(accountNumber)) {
                accounts[i] = null;
                System.out.println("Account closed successfully!");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    void payDividend(double amount) {
        for (Account account : accounts) {
            if (account != null) {
                account.deposit(amount);
            }
        }
        System.out.println("Dividend paid to all accounts.");
    }

    void updateAccounts() {
        for (Account account : accounts) {
            if (account != null) {
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).addInterest();
                } else if (account instanceof CurrentAccount) {
                    double overdraftLimit = ((CurrentAccount) account).overdraftLimit;
                    if (account.balance < 0 && Math.abs(account.balance) > overdraftLimit) {
                        System.out.println("Letter sent to CurrentAccount holder: Overdraft exceeded!");
                    }
                }
            }
        }
        System.out.println("Accounts updated.");
    }
}

// Main class
public class E4q3 {
    public static void main(String[] args) {
        // Creating some test accounts
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 2.5);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 500, 200);

        // Creating a bank and opening accounts
        Bank bank = new Bank(5);
        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);

        // Displaying account information
        System.out.println("Account Information:");
        savingsAccount.displayInfo();
        currentAccount.displayInfo();

        // Performing transactions
        savingsAccount.deposit(200);
        currentAccount.withdraw(300);

        // Displaying updated account information
        System.out.println("\nUpdated Account Information:");
        savingsAccount.displayInfo();
        currentAccount.displayInfo();

        // Closing an account
        bank.closeAccount("SA001");

        // Paying dividend to remaining accounts
        bank.payDividend(50);

        // Updating accounts (adding interest to SavingsAccount and checking overdraft in CurrentAccount)
        bank.updateAccounts();
    }
}