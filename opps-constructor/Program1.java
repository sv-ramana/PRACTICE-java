class chair
{
	int nooflegs;
	String colour;
	String brand;
	String type;
	chair()
	{
		nooflegs=10;
		colour="red";
		brand="italian";
		type="plastic";
	}
}class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		chair c1=new chair();
		System.out.println("no of legs="+c1.nooflegs);
		System.out.println("colour="+c1.colour);
		System.out.println("brand="+c1.brand);
		System.out.println("type="+c1.type);
		System.out.println("main method ended");
		chair c2=new chair();
		System.out.println("no of legs="+c2.nooflegs);
		System.out.println("colour="+c2.colour);
		System.out.println("brand="+c2.brand);
		System.out.println("type="+c2.type);
		System.out.println("main method ended");
	}
}