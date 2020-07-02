package fileHandlinExcel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelRange 
{
	public void readRange(int a, int b) throws BiffException, IOException
	{
		File f = new File("/Users/sahil/Documents/readCell.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		int rows = sh.getRows();
		int col = sh.getColumns();
		
		for (int i = 0; i <= rows; i++)
		{
			for (int j = 0; j <= col; j++)
			{
				if (i>a && i<=b)
				{
					Cell cl = sh.getCell(j, i);
					System.out.println(cl.getContents());
				}
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting row:");
		int sr = sc.nextInt();
		System.out.println("Enter end row:");
		int er = sc.nextInt();
		
		ReadExcelRange rr = new ReadExcelRange();
		rr.readRange(sr, er);
		
		sc.close();
	}
}
