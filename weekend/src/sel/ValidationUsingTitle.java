package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationUsingTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("http"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}
}
