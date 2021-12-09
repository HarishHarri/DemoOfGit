package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountofOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/MovieDropDown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//Select[@id='BookMyShow']"));
		Select sel=new Select(ele);
		List<WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println(count);
		for (WebElement text : options) 
		{
			String texts = text.getText();
			System.out.println(texts);
		}
	}
}
