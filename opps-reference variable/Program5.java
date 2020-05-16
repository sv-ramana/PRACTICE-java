class demo4
{
	int a;
	demo4()
	{
		System.out.println("started");
		a=10;
	}
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo4 result=new demo4();
		System.out.println("a="+result.a);
		System.out.println("main method ended");
}
}