package assignments;

import java.util.Scanner;

//Input: 153
//Armstrong: (1*1*1) + (5*5*5) + (3*3*3) = 153

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int r, sum = 0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		
		while(a>0)
		{
			r = a % 10;
			sum = sum + (r*r*r);
			//System.out.println(sum);
			a = a/10;
		}
		if (temp == sum)
			System.out.println("Number is armstrong");
		else
			System.out.println("Not an armstrong number");
		sc.close();
	}

}
