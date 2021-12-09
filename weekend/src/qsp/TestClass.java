package qsp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends Generic
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	}
 }

