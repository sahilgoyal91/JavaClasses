package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData 
{
	public void writeData(int a) throws IOException
	{
		File f = new File("/Users/sahil/Documents/WriteFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < a; i++)
		{
			System.out.println("Enter data:");
			s = scn.nextLine();
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		scn.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to be added:");
		int a = sc.nextInt();
		
		WriteData wd = new WriteData();
		wd.writeData(a);
		
		sc.close();
				

	}

}
