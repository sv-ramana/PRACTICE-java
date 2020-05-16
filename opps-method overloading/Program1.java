class google
{
	public void search(String data)
	{
		System.out.println("executing data="+data);
	}
	public void search(int data)
	{
		System.out.println("executing int data="+data);
	}
	public void search(double data)
	{
		System.out.println("executing double data="+data);
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		google g1=new google();
		g1.search("skills");
		g1.search(23);
		g1.search(3.3);
		System.out.println("main method ended");
	}
}