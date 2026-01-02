package javabasics.cj5.encapsulation;


// Sealed class
sealed class Account permits SavingsAccount, CurrentAccount {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

// Permitted subclasses
final class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
}

final class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }
}
// Illegal: Cannot extend Account unless listed in permits
// public class LoanAccount extends Account { }
public class SealedDemo {
    public static void main(String[] args) {
        Account savingAcc = new SavingsAccount(15000.00);
        Account currentAcc = new CurrentAccount(89000.00);
        System.out.println("Savings Account---->");
        System.out.println("Balance before deposit: "+savingAcc.getBalance());
        savingAcc.deposit(3000);
        System.out.println("Balance After deposit: "+savingAcc.getBalance());

        System.out.println("Current Account---->");
        System.out.println("Balance before deposit: "+currentAcc.getBalance());
        currentAcc.deposit(3000);
        System.out.println("Balance After deposit: "+currentAcc.getBalance());
    }
}


