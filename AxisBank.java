package week3assignement.day1;

public class AxisBank extends BankInfo{

	
	public void deposit()
	{
		System.out.println("This is depooosit account");
	}
	public static void main(String[] args) {
		
		AxisBank axis=new AxisBank();
		axis.deposit();
	}
	
}
