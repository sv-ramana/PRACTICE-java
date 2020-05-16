class Program1
{
	int resolution=2000;
	String brand="epson";
	double price=34.58;
	public void display()
	{
		System.out.println("display content");
	}
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("resolution="+new Program1().resolution);
		System.out.println("brand="+new Program1().brand);
		System.out.println("price="+new Program1().price);
		new Program1().display();
		System.out.println("main method started");
	}
}