class Demo3
{
	float frequency=220.6f;
	int range=500;
	public void generatesound()
	{
		System.out.println("generate sound");
	}
}
class Program1
{
	public static void main(String []args)
	{
		Demo3 de=new Demo3();
		System.out.println("frequenc="+de.frequency);
		System.out.println("range="+de.range);
		de.generatesound();
	}
}