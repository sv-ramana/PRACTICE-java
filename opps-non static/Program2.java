class demo4
{
	static String nameofplan="oops house";
	String nameofeachhouse="ka pual";
	static double size=50000.00;
	static int noofhouses=4;
	double sizeofeachhouse=1000.10;
	byte nooffloors=25;
	boolean haslift=true;
	boolean hasswimmingpool=true;
	static boolean hasparking=true;
	static boolean hasgarden=true;
	static boolean hasgym=true;
	boolean hasbar=true;;
}
class Program2
{
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("name of plan="+demo4.nameofplan);
		System.out.println("name of each house="+new demo4().nameofeachhouse);
		System.out.println("size="+demo4.size);
		System.out.println("no of houses="+demo4.noofhouses);
		System.out.println("size of each houses="+new demo4().sizeofeachhouse);
		System.out.println("no of floors="+new demo4().nooffloors);
		System.out.println("has lift="+new demo4().haslift);
		System.out.println("has swimming pool="+new demo4().hasswimmingpool);
		System.out.println("has parking="+demo4.hasparking);
		System.out.println("has garden="+demo4.hasgarden);
		System.out.println("has gym="+demo4.hasgym);
		System.out.println("has bar="+new demo4().hasbar);
		System.out.println("no of floors="+new demo4().nooffloors);
		System.out.println("main method ended");
}
}