class demo2
{
	int res=5;
	boolean result=true;
}
class demo3 extends demo2       //assigning sub class object to super class reference variable ic upcasting//
{
	public void disp()
	{
		System.out.println("disp method executed");
	}
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo2 d2=new demo3();
		System.out.println("res="+d2.res);
		System.out.println("result="+d2.result);
		System.out.println("main methos ended");
		//d2.disp();     not valid because it takes only demo2 as a main super class//
	}
}