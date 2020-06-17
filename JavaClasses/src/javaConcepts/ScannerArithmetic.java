package javaConcepts;

import java.util.Scanner;

// (((((x1+x2)-x3)+x4)*x5)/x6)

public class ScannerArithmetic 
{
	
	public int Addition(int a,int b)
	{
		int c;
		c = a + b;
		return c;
	}
	public int Subtraction(int a, int b)
	{
		int c;
		c = a - b;
		return c;
	}
	
	public int Multiplication(int a,int b)
	{
		int c;
		c = a * b;
		return c;
	}
	public void Division(int a, float b)
	{
		float c;
		c = a / b;
		System.out.println("Final Result is: " + c);
	}
	
	public static void main(String[] args) 
	{
		ScannerArithmetic sa = new ScannerArithmetic();
		Scanner sc  = new Scanner(System.in);
		System.out.println("****Take inputs****");
		
		System.out.println("Enter the value for x1:");
		int x1 = sc.nextInt();
		System.out.println("Enter the value for x2:");
		int x2 = sc.nextInt();
		System.out.println("Enter the value for x3:");
		int x3 = sc.nextInt();
		System.out.println("Enter the value for x4:");
		int x4 = sc.nextInt();
		System.out.println("Enter the value for x5:");
		int x5 = sc.nextInt();
		System.out.println("Enter the value for x6:");
		float x6 = sc.nextFloat();
		sc .close();
		int add = sa.Addition(x1, x2);
		int sub = sa.Subtraction(add, x3);
		int add1 = sa.Addition(sub, x4);
		int mult = sa.Multiplication(add1, x5);
		sa.Division(mult, x6);	
	}

}
