package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/MovieDropDown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//Select[@id='BookMyShow']"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("E");
		Thread.sleep(2000);
		sel.selectByVisibleText("Bindas");
		Thread.sleep(2000);
		sel.deselectAll();
	}
}
