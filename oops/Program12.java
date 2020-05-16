class clock
{
	static String timeformat="24hours";
	String brand="titan";
	double price=20.0;
	public static void displaytime()
	{
		System.out.println("display time");
	}
	public static void moralstory()
	{
	System.out.println("work is everything");
	}
}
class Program12
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println(clock.timeformat);
		System.out.println(new clock().brand);
		System.out.println(new clock().price);
		clock.displaytime();
	}
}	