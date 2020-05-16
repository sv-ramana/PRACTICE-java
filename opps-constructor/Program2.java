class chocolate
{
	String brand;
	double price;
	int noofbytes;
	String flavour;
	chocolate(String n,double p,int b,String f)
	{
		brand=n;
		price=p;
		noofbytes=b;
		flavour=f;
	}
}
class Program2
{
	public static void main(String []args)
	{
		chocolate result=new chocolate("asha",5.6,12,"chocolate");
		System.out.println("brand="+result.brand);
		System.out.println("price="+result.price);
		System.out.println("no of bytes="+result.noofbytes);
		System.out.println("flavour="+result.flavour);
		chocolate result1=new chocolate("kitkat",5.6,12,"chocolate");
		System.out.println("brand="+result1.brand);
		System.out.println("price="+result1.price);
		System.out.println("no of bytes="+result1.noofbytes);
		System.out.println("flavour="+result1.flavour);
}
}