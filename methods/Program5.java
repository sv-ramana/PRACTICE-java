class Program5
{
	public static int nearest10(int a,int b)
	{
		int result1=10-a;
		int result2=10-b;
		if(result1 < 0)
		{
			System.out.println(result1=result1*-1);
		}
		if(result2 < 0)
		{
			System.out.println(result2=result2*-1);
		}
		if(result1==result2)
		{
			return 0;
		}
		else if(result1 < result2)
		{
			return a;
		}
		else{
			return b;
		}
		}
		public static void main(String []args)
		{
			System.out.println("main method started");
			int out1=nearest10(8,13);
			System.out.println("out1="+out1);
			int out2=nearest10(13,8);
			System.out.println("out2="+out2);
			int out3=nearest10(7,13);
			System.out.println("out3="+out3);
			System.out.println("main method ended");
		}
		
	}