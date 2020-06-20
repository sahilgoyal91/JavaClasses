package assignment;

public class ParentClass 
{
	public ParentClass()
	{
		this(1,2);
		System.out.println("Default Parent Constructor");
	}
	
	public ParentClass(int a)
	{
		this(1,2,3);
		System.out.println("One Parameterized Parent Constructor");
	}
	
	public ParentClass(int a, int b)
	{
		this(1);
		System.out.println("Two Parameterized Parent Constructor");
	}
	
	public ParentClass(int a, int b,int c)
	{
		System.out.println("Three Parameterized Parent Constructor");
	}
}
