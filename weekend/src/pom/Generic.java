package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic 
{
   @FindBy(id="username")
   private WebElement user;
   
   @FindBy(name="pwd")
   private WebElement pass;
   
   @FindBy(xpath="//div[.='Login ']")
   private WebElement lgn_btn;
   
   public Generic(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void username(String un)
   {
	   user.sendKeys(un);
   }
   
   public void password(String pwd)
   {
	   pass.sendKeys(pwd);
   }
   
   public void loginbutton()
   {
	   lgn_btn.click();
   }
}
