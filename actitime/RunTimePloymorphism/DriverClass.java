package RunTimePloymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		ClassA.demoTest(new ChromeDriver(), "https://www.google.co.in/", "Google");
		ClassA.demoTest(new FirefoxDriver(), "https://www.google.co.in/", "Google");
		ClassA.demoTest(new EdgeDriver(), "https://www.google.co.in/", "Google");

	}

}
