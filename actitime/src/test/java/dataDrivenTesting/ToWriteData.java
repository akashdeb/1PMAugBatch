package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//The physical representation ogf excel file to java representation
		FileInputStream fis = new FileInputStream("./testData/excelData1.xlsx");
		// loading the java representation
		Workbook workbook = WorkbookFactory.create(fis);
		//Writing the data in java representation
		workbook.getSheet("Sheet1").getRow(1).createCell(3).setCellValue("Offline");
		//Converting the java representation to physical representation
		FileOutputStream fos = new FileOutputStream("./testData/excelData1.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("Data is Modified");
		
		
	}

}
