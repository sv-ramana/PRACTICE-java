class Program7       //normal program output of 5 using array//
{
	public static void main(String []args)
	{
		int []n;
		n=new int[5];
		n[0]=22;
		n[1]=33;
		n[2]=44;
		n[3]=55;
		n[4]=66;
	System.out.println("main method started");
	System.out.println(n[0]);
	System.out.println(n[1]);
	System.out.println(n[2]);
	System.out.println(n[3]);
	System.out.println(n[4]);
	System.out.println("main method ended");
	System.out.println("main method started");     //for loop for using array//
	for(int index=0;index<n.length;index++)
		{
		System.out.println(n[index]);
		}
	System.out.println("main method ended");
	}
}