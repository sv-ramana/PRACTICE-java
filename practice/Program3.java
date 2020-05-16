class sample1
{
	public void test1() 
	{
		int a=10;
		static int b=11;
		System.out.println("main method stated");
	}
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("a="+new sample1().a);//same in non static and different class//
		System.out.println("b="+sample1.b);
		System.out.println("main method ended");l
	}	
}

