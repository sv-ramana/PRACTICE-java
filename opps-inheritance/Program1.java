class Whatsappv1
{
	public void message()
	{
		System.out.println("executed message.....");
	}
}
class Whatsappv2 extends Whatsappv1
{
	public void call()
	{
		System.out.println("executed calls...");
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		Whatsappv2 v2=new Whatsappv2();
		v2.call();
		Whatsappv1 v1=new Whatsappv1();
		v1.message();
		System.out.println("main method ended");
	}
}