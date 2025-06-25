package ThisFinalStaticKeyword;

class BankAccount {
    static String bankName = "National Bank";
    private static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "A001");
        BankAccount acc2 = new BankAccount("Bob", "B002");

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
