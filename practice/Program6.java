class demo2
{
	String name;
	int cls;
	String education;
	demo2(String a,int b,String c)
	{
		name=a;
		cls=b;
		education=c;
	}
}
class Program6
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		demo2 d2=new demo2("venkat",33,"b tech");
		System.out.println("name="+d2.name);
		System.out.println("name="+d2.cls);
}

}