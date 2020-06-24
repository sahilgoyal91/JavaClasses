package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataRange 
{
	public void writeData(int a, int b) throws IOException
	{
		File f = new File("/Users/sahil/Documents/WriteFileRange.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		Scanner scn = new Scanner(System.in);
		
		for (int i = 1; i<=b; i++) 
		{
			if ((i>=a) && (i<=b))
			{
				System.out.println("Enter the data:");
				s = scn.nextLine();
				bw.write(s);
				bw.newLine();
			}
			else
			{
				bw.newLine();
			}
		}
		bw.close();
		scn.close();
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting row:");
		int a = sc.nextInt();
		System.out.println("Enter the end row:");
		int b = sc.nextInt();
		
		WriteDataRange wd = new WriteDataRange();
		wd.writeData(a, b);
		
		sc.close();

	}

}
