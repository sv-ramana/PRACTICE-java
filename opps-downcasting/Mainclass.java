class program1
{
	int a=33;
	public void test()
	{
		System.out.println("test method ");
	}
}
class program2 extends program1
{
	float n=2.22f;
	public void end()
	{
		System.out.println("end method");
	}
}
class program3 extends program2
{
	boolean b=true;
	public void start()
	{
		System.out.println("start method");
	}
}
class Mainclass
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		program2 p3=new program3();//upcasting
		p3.start();
		System.out.println("b="+p3.b);
		p3.end();
		program3 p2=(program2)p3;
		p2.end();
		System.out.println("n="+p2.n);
		program2 p1=(program1)p2;
		p1.test();
		System.out.prntln("a="+p1.a);
		System.out.println("main method ended");
	}
}