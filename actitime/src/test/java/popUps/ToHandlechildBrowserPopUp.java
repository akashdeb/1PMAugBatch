package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlechildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String parentWinId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String id:allWinIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentWinId)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWinId);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
	}

}
