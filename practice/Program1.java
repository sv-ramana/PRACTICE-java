class Program2
{
	public static void test(int f) 
	{
		int a=3;
		System.out.println("main method started");
		a++;
		System.out.println("a="+a);
		a--;
		System.out.println("a="+a);
		++a;
		System.out.println("a="+a);
		--a;
		System.out.println("a="+a);
		int b=4;
		System.out.println(a>b || a<b);
		if(a==b ||  b<a)
		{
			System.out.println("one is executed");
		}
		else
		{
			System.out.println("not executed");
		}
		if(a==b ||  a<b)
		{
			System.out.println("one is executed");
		}
		else if (a>b)
		{
			System.out.println("not executed");
		}
		else if(b<a)
		{
			System.out.println("another one ececuted");
		}
		else
		{
			System.out.println("defualt");
		}
		char grade='b';
		switch (grade)
		{
		case 'a':System.out.println("a grade");
		break;
		case 'b':System.out.println("b grade");
		break;
		}
		for (int i=0;i<3;i++)
		{
			System.out.println("for loop run it would run three times");
		}
		int c=2;
		while(c==2)
		{
			System.out.println("while is executed");
			c++;
		}
		int d=1;
		while (d<5)
		{
			System.out.println("while process again executed");
			d++;
		}
		int e=0;
		do
		{
			System.out.println("do while executed");
		}
		while (e++<4);
	}
}
class Program1
{
	public static void main(String []args)
	{
		System.out.println("main method started of this statement");
		Program2.test(22);  // as same class we can call as like test(22)//
		System.out.println("main method ended of this statement");
	}
} 
