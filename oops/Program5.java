class demo
{
	static int a=13;
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("a="+demo.a);
		demo.a=6;
		System.out.println("a="+demo.a);
		System.out.println("main method ended");
}
}