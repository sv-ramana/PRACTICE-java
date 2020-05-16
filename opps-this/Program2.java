class Sample1
{
	Sample1()
	{
		System.out.println("zero argument constructor");
	}
	Sample1(int a)
	{
		this(22.33);
		System.out.println("int argument constructor");
	}
	Sample1(double a)
	{
		System.out.println("int and  double argument constructor");
	}
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		Sample1 s1=new Sample1(22);
		System.out.println("main method ended");
	}
}