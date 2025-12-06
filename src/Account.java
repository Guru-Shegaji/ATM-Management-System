import java.text.DecimalFormat;
import java.util.*;
public class Account {
	Scanner scan=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("$###,##0.00");
	
	//Set the customer number
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	//Get the customer number
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//Set the pin number
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	//get the pin number
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	//get current account balance
	public double getCurrentBalance() {
		return currentBalance;
	}
	//get saving account balance
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Calculate current account withdrawl
	public double calCurrentWithdraw(double amount) {
		currentBalance=(currentBalance-amount);
		return currentBalance;
	}
	
	//Calculate current account deposit
	public double calCurrentDeposit(double amount) {
		currentBalance=(currentBalance+amount);
		return currentBalance;
	}
	//Calculate saving account withdrawl
		public double calSavingWithdraw(double amount) {
			savingBalance=(savingBalance-amount);
			return savingBalance;
		}
		
	//Calculate saving account depsoit
			public double calSavingDeposit(double amount) {
				savingBalance=(savingBalance+amount);
				return savingBalance;
			}
	//Customer current Account Withdraw Input
	public void getCurrentWithdrawInput() {
		System.out.println("Checking Account Balance: "+moneyFormat.format(currentBalance));
		System.out.println("Amount you want to withdraw from current account: ");
		double amount=scan.nextDouble();
		
		if((currentBalance-amount)>=0) {
			calCurrentWithdraw(amount);
			System.out.println("New Current account Balance: "+moneyFormat.format(currentBalance));
		}
		else {
			System.out.println("Balance cannot be negative."+"\n");
		}
	}
	
	//Customer current Account deposit Input
			public void getCurrentDepositInput() {
				System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
				System.out.println("Amount you want to deposit to current account: ");
				double amount=scan.nextDouble();
				
				if((currentBalance+amount)>=0) {
					calCurrentDeposit(amount);
					System.out.println("New Current account Balance: "+moneyFormat.format(currentBalance));
				}
				else {
					System.out.println("Balance cannot be negative."+"\n");
				}
			}
	
	//Customer saving Account deposit Input
		public void getSavingDepositInput() {
			System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit from saving account: ");
			double amount=scan.nextDouble();
			
			if((savingBalance+amount)>=0) {
				calSavingDeposit(amount);
				System.out.println("New Saving account Balance: "+moneyFormat.format(savingBalance));
			}
			else {
				System.out.println("Balance cannot be negative."+"\n");
			}
		}
	
		public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to withdraw from saving account: ");
			double amount=scan.nextDouble();
			if((savingBalance-amount)>=0) {
				calSavingWithdraw(amount);
				System.out.println("New Saving account Balance: "+moneyFormat.format(savingBalance));
			}
			else {
				System.out.println("Balance cannot be negative."+"\n");
			}
		}
		private int customerNumber;
		private int pinNumber;
		private double currentBalance=0;
		private double savingBalance=0;
	
	
	
}
