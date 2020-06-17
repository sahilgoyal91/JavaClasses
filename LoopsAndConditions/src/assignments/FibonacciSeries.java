package assignments;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34 55.....

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int x = 0, y = 1, temp;
		System.out.println("Enter the length of fibonacci series:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.print(x + " " + y);
		
		for (int i = 2; i <= a; i++)
		{
			temp = x + y;
			System.out.print(" " + temp);
			x = y;
			y = temp;
		}
		sc.close();
	}

}
