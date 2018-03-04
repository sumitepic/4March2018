package XLSREading;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLSRead {

	
	public void read(){
		try {
			Workbook book = Workbook.getWorkbook(new File("C:/epicsoft/12Dec.xls"));
			
			Sheet sheet = book.getSheet(0);
			
			for (int i = 0; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(0,1);
					
					
					System.out.println(cell.getContents());
				}
			}
			
			
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		XLSRead obj = new XLSRead();
		obj.read();
	}
}
