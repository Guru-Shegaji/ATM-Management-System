import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
public class OptionMenu extends Account{
	Scanner scan=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("$###,##0.00");
	HashMap<Integer , Integer> data=new HashMap<Integer , Integer>();
	//Validate login information customer number and pin number
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(9876543,9876);
				data.put(8989898,1890);
				data.put(89878898, 1891);
				System.out.println("Welcome to ATM Project!");
				System.out.println("Enter your customer number:");
				setCustomerNumber(scan.nextInt());
				System.out.println("Enter you pin nmuber:");
				setPinNumber(scan.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n"+"Invalid character(s).Only numbers."+"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("\n"+"Wrong customer number or pin number"+"\n");
		} while(x==1);
	}
	//Display account type menu with selection
	public void getAccountType()
	{
		System.out.println("Select the account you want to access:");
		System.out.println("Type1 - Current Account");
		System.out.println("Type2 - Savings Account");
		System.out.println("Type3 - Exit");
		System.out.println("Choice: ");
		selection=scan.nextInt();
		switch(selection) {
		case 1:
			getCurrent();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye");
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
		}
	}
	//Display current Account menu with selections
	
	public void getCurrent()
	{
		System.out.println("Currnet Account: ");
		System.out.println("Type1 - View Balance");
		System.out.println("Type2 - Withdraw Funds");
		System.out.println("Type3 - Deposit Funds");
		System.out.println("Type4 - Exit");
		System.out.println("Choice: ");
		
		selection=scan.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getCurrent();
		}
	}
	//Display saving Account menu with selections
	
		public void getSaving()
		{
			System.out.println("Saving Account: ");
			System.out.println("Type1 - View Balance");
			System.out.println("Type2 - Withdraw Funds");
			System.out.println("Type3 - Deposit Funds");
			System.out.println("Type4 - Exit");
			System.out.println("Choice: ");
			
			selection=scan.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("\n"+"Invalid Choice."+"\n");
				break;
			}
		}
		int selection;
			
	
}
