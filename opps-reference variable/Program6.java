class demo6
{
	int a;
	demo6(int b)
	{
		System.out.println("started");
		a=b;
	}
}
class Program6
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo6 result=new demo6(28);
		System.out.println("a="+result.a);
		demo6 result1=new demo6(24);
		System.out.println("a="+result1.a);
		new demo6(55);
		System.out.println("main method started");
	}
}