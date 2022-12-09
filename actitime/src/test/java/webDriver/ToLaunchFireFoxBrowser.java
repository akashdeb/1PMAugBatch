package webDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireFoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}
