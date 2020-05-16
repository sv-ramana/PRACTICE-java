class demo
{
	static int a;
	static double b;
	static String c;
	demo()
	{
		a=10;
		b=2.5d;
		c="hallo";
	}
}
class Program4
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo d1=new demo();
		System.out.println("a="+d1.a);
		System.out.println("b="+d1.b);
		System.out.println("c="+d1.c);
		System.out.println("main method ended");
	}
}
		  