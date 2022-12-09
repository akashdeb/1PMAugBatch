package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheCoordinates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point pos = new Point(1000, 100);
		driver.manage().window().setPosition(pos);
		
		Point pos1 = new Point(-1000, 100);
		driver.manage().window().setPosition(pos1);
		
		Point pos2 = new Point(100, -100);
		driver.manage().window().setPosition(pos2);
	}
	}


