package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checked 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sandeep/OneDrive/Desktop/weekendAdv.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean cbox = ele.isSelected();
		System.out.println(cbox);
		if(cbox)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}
}
