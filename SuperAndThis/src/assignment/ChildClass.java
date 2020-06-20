package assignment;

public class ChildClass extends ParentClass
{
	public ChildClass()
	{
		super();
		System.out.println("Default Child Constructor");
	}
	
	public ChildClass(int a)
	{
		this(1, 2, 3);
		System.out.println("One Parameterized Child Constructor");
	}
	
	public ChildClass(int a, int b)
	{
		this(1);
		System.out.println("Two Parameterized Parent Constructor");
	}
	
	public ChildClass(int a, int b,int c)
	{
		this();
		System.out.println("Three Parameterized Child Constructor");
	}
	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass(1,2);
	}

}
