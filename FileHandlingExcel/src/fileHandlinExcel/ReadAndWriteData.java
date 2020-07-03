package fileHandlinExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadAndWriteData 
{
	public void ReadWrite() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f = new File("/Users/sahil/Documents/readCell.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int rows = ws.getRows();
		int col = ws.getColumns();
		
		File f1 = new File("/Users/sahil/Documents/WriteData1.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f1);
		WritableSheet ws1 = wb.createSheet("Sheet1", 0);
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < col; j++)
			{
				Cell cl = ws.getCell(j,i);
				String ss = cl.getContents();
				Label ll = new Label(j,i,ss);
				ws1.addCell(ll);
			}
		}
		wb.write();
		wb.close();
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		ReadAndWriteData rw = new ReadAndWriteData();
		rw.ReadWrite();

	}

}
