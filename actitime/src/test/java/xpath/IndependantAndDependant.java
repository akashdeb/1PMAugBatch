package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDependant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-"
				+ "show=on&as=off&as-pos=1&as-type=HISTORY");
		
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']/../..//div[text()='₹59,990']")).getText();
		System.out.println(price);
	}

}
