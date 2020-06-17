package assignments;

import java.util.Scanner;

// Input: 121
// Palindrome: 121

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int sum = 0, n;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		
		while(a > 0)
		{
			n = a % 10;
			sum = (sum*10) + n;
			a = a/10;
		}
		if(temp == sum)
		{
			System.out.println("Number is Palindrome.");
		}
		else
		{
			System.out.println("Not a Palindrome.");
		}
		sc.close();
	}

}
