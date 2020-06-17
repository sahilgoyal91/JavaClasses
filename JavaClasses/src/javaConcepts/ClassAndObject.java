package javaConcepts;

public class ClassAndObject 
{
	int roll_no, age;
	
	public void Welcome()
	{
		System.out.println("Welcome");
	}
	
	public void Automation()
	{
		System.out.println("Automation is easy");
	}
	
	public static void main(String[] args) 
	{
		ClassAndObject calling = new ClassAndObject();
		calling.Welcome();
		calling.roll_no = 111;
		System.out.println("Roll number = " + calling.roll_no);
		calling.age = 28;
		System.out.println("Age = " + calling.age);
		calling.Automation();
	}
}
