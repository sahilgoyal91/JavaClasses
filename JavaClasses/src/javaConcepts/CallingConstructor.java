package javaConcepts;

public class CallingConstructor 
{
	public CallingConstructor()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public CallingConstructor(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public CallingConstructor(int a, int b)
	{
		this(1);
		System.out.println("Two Parameterized Constructor");
	}
	public CallingConstructor(int a, int b, int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		CallingConstructor cc = new CallingConstructor(1,2);
	}

}
