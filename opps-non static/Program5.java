class Mockinterview
{
	static String subject="core java";
	int rating=1;
	static String batchcode="tcca11";
	String name="moona";
	public static answer()
	{
		System.out.println("aswering all questions");
	}
}
	class Program5
	{
		public static void main(String []args)
		{
			System.out.println("main method started");
			System.out.println("sublect="+mockinterview.subject);
			System.out.println("rating="+new mockinterview().rating);
			System.out.println("batch code="+mockinterview.batchcode);
			System.out.println("name="+new mockinterview().name);
			mockinterview.answer();
			System.out.println("main method ended");
		}
	}