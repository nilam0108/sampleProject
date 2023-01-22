package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestCase1 {

	@Test (priority=1)
	public void TestCaseOne()
	{
		Reporter.log("TestCaseOne 1 called",true);

	}
}
