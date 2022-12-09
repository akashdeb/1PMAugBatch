package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
		//1. Launch the empty browser
		//2. start the server of driver executable 
		
	}

}
