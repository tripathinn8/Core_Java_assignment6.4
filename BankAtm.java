
public class BankAtm {
	int atmId;
	String bankName;
	String location;
	double balance=20000;

void withdraw(double amt) throws BankAtmException
	{
		if(balance<10000)
		{
		throw new BankAtmException("Balance is less than 10000.");
		}
		else if(amt>balance)
		{
		throw new BankAtmException("Amount to be withdrawn is greater than balance.");
		}
		else
		{
		balance=balance-amt;
		}
	System.out.println("The current balance is: "+ balance);	
	}
void deposit(double amt)
	{
		balance=balance + amt;
		System.out.println("The balance amount is: "+ balance);
	}
public static void main(String args[])
	{
	BankAtm obj1=new BankAtm();
	BankAtm obj2=new BankAtm();
	BankAtm obj3=new BankAtm();
	try
	{
		obj1.withdraw(15000);
		obj2.withdraw(25000);
		obj3.withdraw(5000);
	}
	catch(BankAtmException bae)
	{
		bae.printStackTrace();
	}
	}
}
