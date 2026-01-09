package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups="Smoke")
	public void HarryPorterTest()
	{
		Reporter.log("Harry");
	}

}
