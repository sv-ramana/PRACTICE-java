class demo1                   //methodloading  using in non static\\
{
	public void test()
	{
		System.out.println("zero argument existing");
	}
	public void test(int a)
	{
		System.out.println("int argument existed");
	}
	public void test(double b)
	{
		System.out.println("double argument existed");
	}
	public void test(int a,double b)
	{
		System.out.println("int and double agument");
	}
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo1 d1=new demo1();
		d1.test();
		d1.test(22);
		d1.test(2.3);
		d1.test(55,4.55);
		System.out.println("main method ended");

	}
}