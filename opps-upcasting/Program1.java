class demo1
{
	int a=5;
	double d=7.88;
	public void test()
	{
		System.out.println("test executed");
	}
}
class demo2 extends demo1
{
	char c='g';
	public void end()
	{
		System.out.println("end progress");
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo1 d1=new demo2();									//demo2 d1=new demo2();//
		System.out.println("a="+d1.a);
		System.out.println("d="+d1.d);
		//d1.end();	
		d1.test();
		System.out.println("main method ended");
	}
}