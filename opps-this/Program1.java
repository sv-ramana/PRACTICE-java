class sample1
{
	sample1()
	{
		this(23);
		System.out.println("zero arg constryctor");
	}
	sample2(int a);
	{
		this(3.4);
		System.out.println("int argument constructor="+a);
	}
	sample3(double a);
	{
		System.out.println("double argument constructor");
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		sample ref=new sample();
		System.out.println("main method ended");
	}
}