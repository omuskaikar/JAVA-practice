package Exp2;

public class accounts {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount(1.0, 500.0, 200.0); 
        SavingsAccount acc2 = new SavingsAccount(2.0, 600.0, 700.0); 
        acc1.withdraw(); 
        acc1.getBalance(); 
        acc2.Deposit(); 
        acc2.getBalance(); 
    }
}


class Account {
    Double AccountNumber;
    Double Balance;

    Account(Double AccountNumber, Double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    void getBalance() {
      System.out.println(Balance);  
    }
}


class SavingsAccount extends Account {
    Double intrest = 0.65;

    SavingsAccount(Double AccountNumber, Double Balance, Double intrest) {
        super(AccountNumber, Balance);
        this.intrest = intrest;
    }

    void Deposit() {
         Balance = Balance + 0.65 * Balance;
    }
    
    
}


class CurrentAccount extends Account {
    int old_limit = 6000;

    Double wd;

    CurrentAccount(Double AccountNumber, Double Balance, Double money) {
        super(AccountNumber, Balance);
        this.wd = money;
    }

    void withdraw() {
        if (wd > old_limit || wd > Balance) {
            System.out.println("Aukaat ke bahar");
        }
        else {
            Balance = Balance - wd;
        }
    }
    
}