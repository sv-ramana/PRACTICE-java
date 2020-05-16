class sample
{
sample()
{
	System.out.println("zero argument");
}
sample(int a)
{
	System.out.println("int argument constructor="+a);
}
sample(double b)
{
	System.out.println("double argument constructor="+b);
}
sample(int a,double b)
{
	System.out.println("int and double constructor="+a+"."+b);
}
sample(double b,int a)
{
	System.out.println("double and int constructor"+b+"."+a);
}
}
class Program6
{
	public static void main(String []args)
	{
		System.out.println("main methos started");
		sample s1=new sample(2.4,4);
		System.out.println("main methos ended");
	}
}