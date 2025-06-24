package ClassesAndObjects.level2;

class BankAccount{
	String accountHolder;
	long accountNumber;
	int balance;
	
	public BankAccount(String accountHolder, long accountNumber, int balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void afterDeposit(int balance, int deposit) {
		int newBal = (balance+deposit);
		this.balance = newBal;
		System.out.println("Total Balance after deposit: "+newBal);
	}
	
	public void afterWithdraw(int balance, int withdrawAmount) {
		if(withdrawAmount<balance) {
			System.out.println("Total Balance after withdraw: "+(balance-withdrawAmount));
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
	
	public void display() {
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}
public class SimulateAnATM {

	public static void main(String[] args) {
		BankAccount val = new BankAccount("udbhav", 24342456, 50000);
		
		val.display();
		val.afterDeposit(val.balance, 50000);
		val.afterWithdraw(val.balance, 4000);

	}

}
