package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.flipkart.com");
         Thread.sleep(2000);
         String src = driver.getPageSource();
         System.out.println(src);
         driver.close();
	}
}
