package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
				//Converting Physical representation of Property file to Java representation
				FileInputStream fis = new FileInputStream("./src/test/resources/propertyData1.properties");
				Properties property = new Properties();
				//Loading the keys of the property file
				property.load(fis);
				//calling the value using the key
				 return property.getProperty(key);
				

	}

}
