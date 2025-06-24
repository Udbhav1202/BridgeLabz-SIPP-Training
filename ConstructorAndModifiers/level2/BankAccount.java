package ConstructorAndModifiers.level2;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) this.balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(123456, "Amit Kumar", 10000);
        acc.display();
        acc.deposit(5000);
        acc.withdraw(2000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

