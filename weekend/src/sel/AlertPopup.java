package sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("54321");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		System.out.println(text);
		a.accept();
		a.dismiss();
	}
}
