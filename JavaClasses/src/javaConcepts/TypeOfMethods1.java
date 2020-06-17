package javaConcepts;

// ((((10+2)+2)-2)*2)/2)

public class TypeOfMethods1 
{
	public int Add(int a, int b)
	{
		int c=0;
		c = a+b;
		return c;
	}
	
	public int Add1(int a, int b)
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
	
	public int Mult(int a, int b)
	{
		int c=0;
		c = a*b;
		return c;
	}
	
	public void Divide(int a, int b)
	{
		int c;
		c = a/b;
		System.out.println("Result is: " + c);
	}
	public static void main(String[] args) 
	{
		TypeOfMethods1 cal = new TypeOfMethods1();
		int sum = cal.Add(10, 2);
		int sum2 = cal.Add1(sum, 2);
		int diff = cal.Sub(sum2, 2);
		int mult = cal.Mult(diff, 2);
		cal.Divide(mult, 2);	
	}

}
