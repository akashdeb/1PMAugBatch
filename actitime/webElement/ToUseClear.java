package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernametxtFld = driver.findElement(By.id("username"));
		WebElement passwordTxtFld = driver.findElement(By.id("password"));
		
		usernametxtFld.clear();
		usernametxtFld.sendKeys("admin");
		passwordTxtFld.clear();
		passwordTxtFld.sendKeys("Test@123");
	}

}
