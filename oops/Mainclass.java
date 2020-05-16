class Program7
{
	int a=98;
	static double b=89;
	public static void test()
	{
		System.out.println("main method tested started");
	}
	public void end()
	{
		System.out.println("main method tested ended");
	}
}
class Mainclass
{
	public void start()
	{
		System.out.println("executing start method");
	}
	static boolean res=false;
	public static void main(String[]args)
	{
		System.out.println("res="+res);
		System.out.println("b="+ Program7.b);
		System.out.println("a="+ Program7.a);
		Program7().test();
		new Program7().end();
		new Mainclass().start();
	}
}