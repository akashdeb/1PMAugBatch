package screemshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String sysDateTime = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(sysDateTime);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Login ']"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/elementErrorShot"+sysDateTime+".png");
		Files.copy(source, destination);
	}

}
