package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass 
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		Generic g=new Generic(driver);
		g.username("admin");
		Thread.sleep(2000);
		g.password("manager");
		Thread.sleep(2000);
		g.loginbutton();
	}
}
