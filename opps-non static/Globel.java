class demo5
{
	static int a=23;//global primitive static//
	double d=4.5;//global primitive non static//
	static String s1="java";//global non primitive static//
	String s2="testing";//global non primitive non static//
	public static void test(char ch,float f)
	{
		System.out.println("main method started");
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		boolean res=true;
		String s3="remember";
		System.out.println("res="+res);
	}
}
class Globel
{
	public static void main(String []args)
	{
		System.out.println("a="+demo5.a);//
		demo5 result=new demo5();//
		System.out.println("d="+result.d);//
		System.out.println("s1="+demo5.s1);//  all are local premitive if string is theire then local non primitive//
		System.out.println("s2="+result.s2);//
		demo5.test('s',1.1f);//
	}
}