class Idcard 
{
	static String idcardname="qspider";
	static long officecontant=123456789L;
	public static void swipecard()
	{
		System.out.println("add attendence for one days");
	}
	public static void main(String []args)
	{
		System.out.println("main method started");
		System.out.println("id card naem="+IdCard.idcardname);
		System.out.println("office contant="+IdCard.officecontant);
		IdCard.swipecard();
		System.out.println("main method ended");
	}
}