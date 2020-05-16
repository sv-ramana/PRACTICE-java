class Program16             //write a program the power of given number//
{
	public static void main(String []args)
	{
		int num=2;
		int power=4;
		int out=1;
			while (power>0)
			{
			System.out.println(out=out*num);
			power--;
			}
			System.out.println("while loop ended now for loop");
		int num1=2;
		int power1=4;
		int out1=1;
		for(int i=power;power>0;i--)
		{
			System.out.println(out1=out1*num1);
		}
	}
}