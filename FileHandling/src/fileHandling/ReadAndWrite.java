package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite 
{
	public void ReadWrite() throws IOException
	{
		String s;
		File f = new File("/Users/sahil/Documents/ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		File f1 = new File("/Users/sahil/Documents/ReadWrite.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while((s = br.readLine())!=null)
		{
			System.out.println(s);
			bw.write(s);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws IOException 
	{
		ReadAndWrite rw = new ReadAndWrite();
		rw.ReadWrite();
				
	

	}

}
