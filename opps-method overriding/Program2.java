class whatsappv1
{
	public void readmessage()
	{
	System.out.println("two ticks");
	}
}
class whatsappv2 extends whatsappv1
{
	public void readmessage()
	{
		System.out.println("blue ticks");
	}
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		whatsappv2 v2=new whatsappv2();
		v2.readmessage();
		System.out.println("main method ended");
	}
}