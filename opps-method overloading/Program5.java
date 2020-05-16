class demo3
{
	public void disp()
	{
		System.out.println("zero argument ");
	}
}
class demo4 extends demo3
{
	public static void disp(int a)
	{
		System.out.println("int argument");
	}
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo4 d4=new demo4();
		demo4.disp(55);
		d4.disp();
	}
}