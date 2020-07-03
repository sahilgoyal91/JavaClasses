package fileHandlinExcel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteData 
{

	public void writeData(int row, int col) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f = new File("/Users/sahil/Documents/WriteData.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws = wb.createSheet("Sheet 1",0);
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i<=row; i++)
		{
			for (int j = 0; j <= col; j++)
			{
				System.out.println("Enter data in cells:");
				String ss = s.next();
				Label ll = new Label(j,i,ss);
				ws.addCell(ll);
			}
		}
		System.out.println("***File write complete***");
		s.close();
		wb.write();
		wb.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		System.out.println("***Enther the number of rows***");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("***Enter the number of columns***");
		int columns = sc.nextInt();
		
		WriteData wd = new WriteData();
		wd.writeData(rows, columns);
		
		sc.close();
	}
}