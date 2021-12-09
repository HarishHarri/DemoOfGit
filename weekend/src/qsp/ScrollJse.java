package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollJse 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		for(int i=0;i<3;i++)
		{
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		}
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(2000);
		}
	}
}
