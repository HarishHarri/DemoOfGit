package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1
		FileInputStream fis=new FileInputStream("./excel/trial.xlsx");
		
		//step 2
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3
		Sheet s = wb.getSheet("Sheet1");
		
		//step 4
		Row ro = s.getRow(0);
		
		//step 5
		Cell cel = ro.getCell(0);
		
		//step 6
		String val = cel.getStringCellValue();
		System.out.println(val);
	}

}
