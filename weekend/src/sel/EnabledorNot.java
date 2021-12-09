package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnabledorNot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/disabled.html");
	    WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	    text.sendKeys(Keys.CONTROL+"A");
	    Thread.sleep(2000);
	    text.sendKeys(Keys.DELETE);
	}
}
