package assignments;

import java.util.Scanner;

// 4! = 4*3*2*1 = 24

public class Factorial 
{
	public static void main(String[] args) 
	{
		int temp = 1;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++)
		{
			temp = temp*i;
		}
		System.out.println("Factorial of " + a + " is:" + temp);
		sc.close();
	}

}
