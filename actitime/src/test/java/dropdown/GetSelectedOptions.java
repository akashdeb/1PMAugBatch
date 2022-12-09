package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByValue("opel");
		Thread.sleep(2000);
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());
		}
		
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println("The First Selected Option is : "+firstOption.getText());
	}

}
