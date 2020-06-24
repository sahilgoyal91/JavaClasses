package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileRange 
{
	public void ReadData(int a , int b) throws IOException
	{
		File f = new File("/Users/sahil/Documents/ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		int counter1 = 0, counter2 = 0;
		
		while((s=br.readLine())!=null)
		{
			counter1 = counter1 + 1;
			counter2 = counter2 + 1;
			if (counter1 >= a && counter2 <=b)
			{
				System.out.println(s);
			}
		}
		br.close();
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***Enter the start Line:***");
		int a = sc.nextInt();
		System.out.println("***Enter the end line:***");
		int b = sc.nextInt();
		
		ReadFileRange rfr = new ReadFileRange();
		rfr.ReadData(a, b);
		sc.close();
				

	}

}
