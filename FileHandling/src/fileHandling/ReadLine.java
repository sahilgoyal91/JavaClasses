package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLine 
{
	public void readLine(int a) throws IOException
	{
		File f = new File("/Users/sahil/Documents/ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		int counter=0;
		while ((s=br.readLine())!=null) 
		{
			counter = counter+1;
			if (counter == a)
			{
				System.out.println(s);
				break;
			}
		}
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("***Enter the line number to read data***");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		ReadLine rl = new ReadLine();
		rl.readLine(a);
		sc.close();
	}

}
