class HelloWorld
{
	
	private int i;
	private int j;
	private static int k = 10;
	private static Integer l = 20;
		
	HelloWorld()
	{
		System.out.println("inside no arg constructor!!!");				
	}
	
	HelloWorld(int i, int j)
	{
		System.out.println("inside 2 arg constructor!!!");		
		this.i=i;
		this.j=j;
	}
	
	static
	{
		System.out.println("inside static block!!!");		
	}

	{
		System.out.println("inside instance block!!!");		
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method started!!!");
		HelloWorld obj = new HelloWorld();
		
		obj.printHi();
		
		int a = 100;
		int b = 200;
		int result = a + b;
		System.out.println(result);
		
		System.out.println("main method ended!!!");	
		System.out.println("main method ended222!!!");			
	}

	public void printHi()
	{
		int x =22;
		String y = "ABC";
		System.out.println("printHi method started!!!");
		System.out.println("Hiiiii");
		System.out.println("printHi method ended!!!");				
	}
	
}