class Program3
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		int a=5;
		System.out.println("a="+a);
		System.out.println(++a);
		System.out.println("a="+a);
		int b=2;
		int res=++b + ++b;
		System.out.println(res);
		System.out.println("b="+b);
		System.out.println("main method ended");
	}
}