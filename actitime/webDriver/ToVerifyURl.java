package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURl {

	public static void main(String[] args) {
		String expectedUrl = "facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is : "+actualUrl);
		
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Pass: The URL is verified");
		}
		else
			System.out.println("Fail: The URL is not verified");
		
	}

}
