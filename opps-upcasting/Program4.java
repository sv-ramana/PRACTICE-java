class example1
{
	byte b=3;
}
class example2 extends example1
{
	public void stuf()
	{
		System.out.println("start method");
	}
}
class example3 extends example2
{
	int a=11;
	public void end()
	{
		System.out.println("end method");
	}
}
class Program4
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		example3 m3=new example3();
		m3.end();
		m3.stuf(); //upcasting not working here//
		System.out.println("b="+m3.b);
		System.out.println("a="+m3.a);
		example2 e2=m3;
		e2.stuf();
		System.out.println("b="+e2.b);
		example1 e1=e2;
		System.out.println("b="+e1.b);
		Object o=e1;
		System.out.println("main method ended");
	}
}