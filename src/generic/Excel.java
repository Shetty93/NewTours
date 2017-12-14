package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getCellVaue(String path,String sheet,int row,int cell) throws Exception
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	String value=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	return value;
	}
	
	public static int getRowCount(String path,String sheet) throws Exception
	{
	Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	int count=wb.getSheet(sheet).getLastRowNum();
	return count;
	}

}
