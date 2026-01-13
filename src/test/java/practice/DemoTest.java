package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups="Smoke")
	public void HarryPorterTest()
	{
		System.out.println("Harry");
		System.out.println("Hagrid");
	}

}
