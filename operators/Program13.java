class  Program13
{
	public static void main(String []args)
	{
		int a=1,b=4;
		boolean result=(a>b&&++a>++b);
		System.out.println("result="+result);
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=0,d=3;
		boolean result1=(a<b||++a<++b);
		System.out.println("result1="+result1);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}