class facebook
{
	public void login(String username,String password)
	{
		System.out.println("email username="+username);
		System.out.println("email password="+password);
	}
	public void login(long number,String password)
	{
		System.out.println(" user number="+number);
		System.out.println("password="+password);
	}
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		facebook f1=new facebook();
		f1.login("venkat","venkatvenky123");
		f1.login(12345561573L,"venkat123");
		System.out.println("main method ended");
	}
}
