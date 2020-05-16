class light
{
	String brand;
	String lightcolour;
	String type;
	String yah;
	double cost;
	int watts;
	light()
	{
		brand="philips";
		lightcolour="red";
		type="led";
		yah="smart";
		cost=20.32;
		watts=20;
	}
	light(String b,String l,String t,String y,double c,int w)
	{
		brand=b;
		lightcolour=l;
		type=t;
		yah=y;
		cost=c;
		watts=w;
	}
}
class Program5
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		light l1=new light();
		System.out.println("brand="+l1.brand);
		System.out.println("lightcolour="+l1.lightcolour);
		System.out.println("type="+l1.type);
		System.out.println("yah="+l1.yah);
		System.out.println("cost="+l1.cost);
		System.out.println("watts="+l1.watts);
		light l2=new light("philips","red","led","smart",20.00,20);
		System.out.println("brand="+l1.brand);
		System.out.println("lightcolour="+l1.lightcolour);
		System.out.println("type="+l1.type);
		System.out.println("yah="+l1.yah);
		System.out.println("cost="+l1.cost);
		System.out.println("watts="+l1.watts);
	}
}