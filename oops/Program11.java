class Demo3
{
	int a=12;
}
class Program11
{
	public static void main(String []args)
	{
		Demo3 b=new Demo3();
		System.out.println("a="+b.a);
		b=a=57;
		System.out.println("a="+b.a);
		System.out.println("a="+new Demo3().a);
}
}
