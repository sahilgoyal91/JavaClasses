package assignments;

import java.util.Scanner;

public class ArithmeticTable {

	public static void main(String[] args) {
		int b;
		System.out.println("*****Enter the number to print a table*****");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Table for " + a + " is:");
		for (int i = 1; i<=10; i++)
		{
			b = a * i;
			System.out.println(a + "*" + i + "=" + b);
		}
		sc.close();

	}

}
