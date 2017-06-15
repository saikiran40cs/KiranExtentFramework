package testCases;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import configuration.Const;
import operations.Retry;
import reUsableFunctions.RegressionFunc;

public class TC001_Extent_InitialSetup extends RegressionFunc{
	
	
	@Test(priority = 0, enabled = true, dataProvider = "",retryAnalyzer = Retry.class)
	public void tc001()	throws Exception {
		initializeExtentReport();
		String currentDir = "file://" + new File(System.getProperty("user.dir")).getAbsolutePath() + File.separator + "pom.xml";
        testInstance.log(Status.PASS, "First Test  is executed on:"+Const.sdf.format(new Date()));
        testInstance.log(Status.INFO,"<a href='" + currentDir + "'><font color='green'>View Pom file</font></a>");
	}
}
