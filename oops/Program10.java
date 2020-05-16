class Demo2
{
	static char ch='d';
	public static void test(double b)
	{
		System.out.println("excuting test method");
	}
}
class Program10
{
	static boolean res=false;
	public static void main(String []args)
	{
	System.out.println("ch="+Demo2.ch);
	Demo2.test(38.66);
	System.out.println("res="+res);
}
}