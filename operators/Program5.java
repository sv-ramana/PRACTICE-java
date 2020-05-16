class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		int a=3,b=5,sum;
        sum=a++ + b++ + ++a + ++a - b++ + ++b;    
		System.out.println("sum="+sum);
		System.out.println("main method ended");
	}
}