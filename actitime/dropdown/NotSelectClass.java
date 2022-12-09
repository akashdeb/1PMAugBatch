package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		//WebElement element = driver.findElement(By.xpath("//div[text()='Select Option']"));
	
		Actions action=new Actions(driver);
		action.sendKeys(driver.findElement(By.xpath("//div[text()='Select Option']")), "Group 2, option 1").sendKeys(Keys.ENTER).perform();
		driver.navigate().refresh();
		action.sendKeys(driver.findElement(By.xpath("//div[text()='Select Option']")), "Group 2, option 2").sendKeys(Keys.ENTER).perform();

	}

}
