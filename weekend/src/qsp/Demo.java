package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
  @Test
  public void test()
  {
	  Reporter.log("1", true);
  }
  
  @Test
  public void demoo()
  {
	  Reporter.log("2", true);
  }
  
  @Test
  public void demo()
  {
	  Reporter.log("3", true);
  }
}
