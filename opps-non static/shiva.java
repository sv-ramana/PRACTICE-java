class sample
{
	int a=23;
	static double b=34.56;
	public static void  start()
	{
		System.out.println("executing start method");
	}  
	public void end()
	{
		System.out.println("executing end method");
	}
}
class mainclass7
{
		boolean res=true;
		static char ch='a';
	public static void test()
	{
		System.out.println("executing disp method");
	}
	public static void main(String[]args)
	{
		System.out.println("a="+new sample().a);
		System.out.println("b="+sample.b);
		sample.start();
		new sample().end();
		System.out.println("ch="+ch);
		test();

	}
}
