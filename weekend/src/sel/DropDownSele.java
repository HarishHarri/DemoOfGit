package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSele 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/CafeMenu.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//select[@id='Kaze']"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("B");
		Thread.sleep(2000);
		sel.selectByVisibleText("Cheese cake");
		sel.deselectAll();
	}
}
