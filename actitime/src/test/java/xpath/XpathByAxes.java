package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		String productName = "APPLE iPhone 13 (Starlight, 128 GB)";
		String productPrice = "₹60,990";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		
		 driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+productPrice+"']")).click();
	
	}

}
