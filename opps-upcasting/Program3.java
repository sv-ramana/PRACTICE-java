class sample1
{
	int v=44;
	public void test()
	{
		System.out.println("service 1");
	}
}
class sample2 extends sample1
{
	boolean result=false;
}
class sample3 extends sample2
{
	public void disp()
	{
		System.out.println("disp mode executed");
	}
	public void start()
	{
		System.out.println("start method executed");
	}
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		sample3 s3=new sample3();
		System.out.println("v="+s3.v);
		s3.test();
		s3.disp();
		s3.start();
		sample2 s2=s3;
		System.out.println("v="+s2.v);
		s2.test();
		System.out.println("result="+s2.result);
		sample1 s1=s2;
		System.out.println("v="+s1.v);
		object ob=s1;
		System.out.println("main method ended");
	}
}