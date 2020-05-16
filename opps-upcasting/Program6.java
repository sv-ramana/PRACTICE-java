class demo1
{
	int a=12;
	public void test()
	{
		System.out.println("execution test method");
	}
}
class demo2 extends demo1
{
	String s="venkat";
	public void end()
	{
		System.out.println("excution of end method");
	}
}
class demo3 extends demo2
{
	float b=22.22f;
	public void start()
	{
		Syetem.out.println("executionn of start method");
	}
}
class program6
{
	public static void main(String []srgs)
	{
		System.out.prntln("main method started");
		demo3 d3=new demo3();
		d3.start();
		System.out.println("b="+d3.b);
		demo2 d2=d3;
		d2.end();
		System.out.println("s="+d2.s);
	}
	public void code(object ob)
	{
		System.out.println("object method");
	}
}
class Program7
{
	public static void main(String []args)
	{
		System.out.println("main method started again");

{
}
}