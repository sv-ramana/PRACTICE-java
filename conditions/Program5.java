class Program5 
{
	public static void main(String []args)
	{
		boolean balance=25000.00;
		boolean withdraw=14000.00;
		int store=1432,pin=1432;
		if(store!=pin)
		{
			System.out.println("enter the correct pin");
		}
		else if(store==pin)
		{
			System.out.println("take your money thankyou");
		}
		else if(balance>withdraw)
		{
			System.out.println("first deposit money");
		}
		else
		{
			System.out.println("re enter the card and try again");
		}
	}
}
		