package javaConcepts;

// ((((10/2)+2)-2)-2)*2)

public class TypesOfMethods2 {
	
	public int Div(int a, int b)
	{
		int c;
		c = a/b;
		return c;
		
	}

	public int Add(int a, int b)
	{
		int c=0;
		c = a+b;
		return c;
		
	}
	
	public int Sub(int a, int b)
	{
		int c=0;
		c = a-b;
		return c;
		
	}
	
	public int Sub1(int a, int b)
	{
		int c=0;
		c = a-b;
		return c;
		
	}
	
	public void Mult(int a, int b)
	{
		int c=0;
		c = a*b;
		System.out.println("Result is: " + c);
	}
	
	
	public static void main(String[] args) 
	{
		TypesOfMethods2 cal1 = new TypesOfMethods2();
		int div = cal1.Div(10, 2);
		int sum = cal1.Add(div, 2);
		int diff = cal1.Sub(sum, 2);
		int diff2 = cal1.Sub1(diff, 2);
		cal1.Mult(diff2, 2);	
	}

}
