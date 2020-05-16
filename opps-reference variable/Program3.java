class sample
{
	int a=1;
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		sample s1=new sample();
		System.out.println("a="+s1.a);
		sample s2=new sample();
		s1.a=s2.a;
		System.out.println("a="+s2.a);
		System.out.println("main method ended");
	}
}
