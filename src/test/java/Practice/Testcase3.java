package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase3 {

	@Test(priority=3)
	public void testCase3()
	{
		Reporter.log("testCase3 called",true);
	}
}
