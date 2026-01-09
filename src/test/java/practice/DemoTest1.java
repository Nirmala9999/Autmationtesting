package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1
{
	@Test(groups="Regression")
	public void HarryPorterTest1()
	{
		Reporter.log("Harmonine");
	}
}
