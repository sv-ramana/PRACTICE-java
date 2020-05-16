class Program20
{
	public static void main(String []args)
	{
		int num=53463534;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			System.out.println(count++);
		}
	}
}