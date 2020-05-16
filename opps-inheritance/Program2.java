class Day1
{
	public void apti()
	{
		System.out.println("lucklly apti round finidhed");
	}
	public void gd()
	{
		System.out.println("yah gd over");
	}
}
class Day2 extends Day1
{
	public void tr1()
	{
		System.out.println("tr1 completed");
	}
}
class Day3 extends Day2
{
	public void tr2()
	{
		System.out.println("tr2 completed");
	}
}
class Day4 extends Day3
{
	public void hr()
	{
		System.out.println("hr completed");
	}
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		Day4 d4=new Day4();
		d4.hr();
		d4.tr2();
		d4.tr1();
		d4.gd();
		d4.apti();
	}
}