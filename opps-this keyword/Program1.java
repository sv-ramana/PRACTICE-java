class mobile
{
		int storage;
		String osversion;
		int batterymah;
		float commonpixel;
		mobile(int storage,String osversion,int batterymah,float commonpixel)
	{
			this.storage=storage;
			this.osversion=osversion;
			this.batterymah=batterymah;
			this.commonpixel=commonpixel;
	}
}
class Program1
{
	public static void main(String []args)
	{
		mobile m1=new mobile(200,"pie",500,48f);
		System.out.println("storage="+m1.storage);
		System.out.println("os versions="+m1.osversion);
		System.out.println("battery mah="+m1.batterymah);
		System.out.println("common pixel"+m1.commonpixel);
		mobile m2=new mobile(2000,"kitkat",5000,88f);
		System.out.println("storage="+m2.storage);
		System.out.println("os versions="+m2.osversion);
		System.out.println("battery mah="+m2.batterymah);
		System.out.println("common pixel"+m2.commonpixel);
	}
}