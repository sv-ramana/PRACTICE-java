class Board
{
	int length;
	double cost;
	String colour;
	Board()
	{
		length=10;
		colour="red";
		cost=20.22;
	}
	Board(int length)
	{
		this();
		this.length=length;
	}
	Board(int length,String colour)
	{
		this();
		this.length=length;
		this.colour=colour;
	}
}
class Program3
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		Board b1=new Board(22,"blue");
		System.out.println("length="+b1.length);
		System.out.println("colour="+b1.colour);
		System.out.println("price="+b1.cost);
	}
}