package assignments;

import java.util.Scanner;

// No. divisible by itself or 1.

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int flag = 0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		if (a == 0 || a == 1)
		{
			System.out.println("Not a prime number.");
		}
		else
		{
			for(int i = 2; i <= a/2 ; i++)
			{
				if(a % i == 0)
				{
					System.out.println("Not a prime number.");
					flag = 1;
					break;
				}
			}
				if(flag == 0)
					System.out.println("Number is prime.");
		}
		sc.close();
	}

}
