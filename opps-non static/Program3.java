class Program3
{
	int resolution=2000;
	String brand="epision";
	double price=34.58;
	public void display()
	{
		System.out.println("display contant");
	}
	public static void main(String []args)
	{
		System.out.println("resolution="+new Program3().resolution);
		System.out.println("brand="+new Program3().brand);
		System.out.println("price="+new Program3().price);
		new Program3().display();
	}
} 