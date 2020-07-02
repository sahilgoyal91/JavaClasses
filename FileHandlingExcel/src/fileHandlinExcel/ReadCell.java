package fileHandlinExcel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadCell 
{

	@SuppressWarnings("unused")
	public void readCell(int a, int b) throws BiffException, IOException
	{
		File f = new File("/Users/sahil/Documents/readCell.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		for (int i = 0; i < r; i++)
		{
			if( (i>=a) && (i <= b))
			{
				for (int j = 0; j < c; j++)
				{
						Cell cl = ws.getCell(j,i);
						System.out.print(cl.getContents() + " ");
				}
				System.out.println(" ");
			}
			else if(i>b)
			{
				break;
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
		ReadCell rc = new ReadCell();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row number:");
		int r = sc.nextInt();
		System.out.println("Enter column number:");
		int c = sc.nextInt();
		
		rc.readCell(r, c);
		
		sc.close();
	}
}