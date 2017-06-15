package testCases;

import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import configuration.Const;
import reUsableFunctions.RegressionFunc;

public class TC002_Extent_SuiteTest extends RegressionFunc{
	
	@Test
	public void tc002()	throws Exception {
		initializeExtentReport();
		testInstance.log(Status.INFO, "Second Test is executed on: "+Const.sdf.format(new Date()));
	}
}
