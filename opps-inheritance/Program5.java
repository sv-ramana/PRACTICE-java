class sample4
{
	int a=66;
}
class sample5 extends sample4
{
	int a=77;
	public void camp()
	{
		System.out.println(super.a);
		System.out.println("a="+a);
	}
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method stated");
		sample5 s5=new sample5();
		System.out.println("a="+s5.a);
		s5.camp();
		System.out.println("main method ended");
	}
}