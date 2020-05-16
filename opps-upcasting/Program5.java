class demo1
{
	int a=7;
	public void test()
	{
		System.out.println("execting test method");
	}
}
class demo2 extends demo1
{
	double b=2.8;
	public void end()
	{
		System.out.println("excuting end method");
	}
}
class demo3 extends demo2
{
	boolean c=false;
	public void start()
	{
		System.out.println("execting start method");
	}
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo3 d3 = new demo3();
		d3.start();
		demo2 d2=d3;//upcasting//
		d3.end();
		System.out.println("b="+d3.b);
		demo1 d1=d3;
		System.out.println("a="+d1.a);
		d1.test();
	}

}