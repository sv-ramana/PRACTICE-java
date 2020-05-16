class sample
{
	char ch='w';
	public void test(String s1)
	{
		System.out.println("test method executed");
	}
}                                                          //in this its calling from non static method function so its is write in new //
class Program6
{                                                                      //class name () .what u want to call data type//
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("ch="+new sample().ch);
		new sample().test("it is non static program small different");
		System.out.println("main method emded");
	}
}