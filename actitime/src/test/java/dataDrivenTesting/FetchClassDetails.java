package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchClassDetails {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/ClassInfo.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		String name1 = workbook.getSheet("class").getRow(1).getCell(0).toString();
		boolean gf = workbook.getSheet("class").getRow(1).getCell(2).getBooleanCellValue();
		double age = workbook.getSheet("class").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println("Name "+name1+" GF?? "+gf+" age "+age);
	
	}

}
