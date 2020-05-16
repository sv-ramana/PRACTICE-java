class  Program6
{
	public static void main(String []args)
	{ 
		int a=2,b=6,result;
		result=++a - ++b + a++ + ++b - a++ + b++;
		System.out.println("result="+result);
	}
}