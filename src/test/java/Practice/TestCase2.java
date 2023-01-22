package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test(priority=2)
	public void TestCaseTwo()
	{
		Reporter.log("Test Case 2 called",true);
	}
}
