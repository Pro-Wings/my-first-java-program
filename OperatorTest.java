class OperatorTest
{
	public static void main(String[] args)
	{
		int a = 5, b = 7;
		
		//a = a + b;
		a += b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		
		//boolean res = a>b;
		System.out.println("(a>b) = "+(a>b));

		System.out.println("(a<b) = "+(a<b));
		
		System.out.println("(a==b) = "+(a==b));
		System.out.println("(a!=b) = "+(a!=b));

		System.out.println("(a>b)&&(a==b) = "+((a>b)&&(a==b)));		
		System.out.println("(a>b)&&(a!=b) = "+((a>b)&&(a!=b)));		
		
		System.out.println("(a>b)||(a==b) = "+((a>b)||(a==b)));		
	}
}