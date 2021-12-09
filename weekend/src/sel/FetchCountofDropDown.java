package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchCountofDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/CafeMenu.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//select[@id='Kaze']"));
		 Select sel=new Select(ele);
		 List<WebElement> option = sel.getOptions();
		 int count = option.size();
		 System.out.println(count);
		 for (WebElement options : option) 
		 {
			String text = options.getText();
			System.out.println(text);
		 }
		 
	}
}
