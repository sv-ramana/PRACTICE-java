class Program4
{
	public static boolean samelastdigit(int a,int b)
	{
		if((a%17)==(b%7))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String []args)
	{
		boolean res1=samelastdigit(5,6);
			if(res1==true)
		{
			System.out.println("same last digit");
		}
		else
		{
			System.out.println("different last digits");

}
	}
}