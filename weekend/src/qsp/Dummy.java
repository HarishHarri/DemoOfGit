package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dummy 
{
    @Test(enabled=true)
    public void test()
    {
    	Reporter.log("123", true);
    }
    
    @Test(enabled=false)
    public void tests()
    {
    	Reporter.log("456",true);
    }
}
