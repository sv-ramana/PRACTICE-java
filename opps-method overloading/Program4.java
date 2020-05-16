class demo2         //method overloading in using static //
{
	public static void test()
	{
		System.out.println("zero argument");
	}
	public static void test(int a)
	{
		System.out.println("int argument");
	}
}
class Program4
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo2 d2=new demo2();
		demo2.test();
		demo2.test(22);
		System.out.println("main method ended");
	}
}