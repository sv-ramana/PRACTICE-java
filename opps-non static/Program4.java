class whatsapp
{
	static String applicationname="whatsapp";
	String username="moona";
	long mobilenumber=9848022338L;
	int noofcontant=500;
	static String developer="jai balaya";
	float version=20f;
	static String logocolour="green";
}
class Program4
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("application name="+whatsapp.applicationname);
		System.out.println("user name="+new whatsapp().username);
		System.out.println("mobile number="+new whatsapp().mobilenumber);
		System.out.println("no of contant="+new whatsapp().noofcontant);
		System.out.println("developer="+whatsapp.developer);
		System.out.println("version="+new whatsapp().version);
		System.out.println("logo colour="+ whatsapp.logocolour);
		System.out.println("main method ended");
	}
}