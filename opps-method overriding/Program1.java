class gmailv1
{
	public void composemsg()
	{
		System.out.println("normal screen version 1");
	}
}
class gmailv2 extends gmailv1
{
	public void composemsg()
	{
		System.out.println("pop up screen");
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		gmailv2 v2=new gmailv2();
		v2.composemsg();
		System.out.println("main method ended");
	}
}