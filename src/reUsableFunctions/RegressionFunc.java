package reUsableFunctions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import operations.ExtentManager;

public class RegressionFunc extends ExtentManager {

	protected ExtentReports extentInstance;
	protected ExtentTest testInstance;
	protected ExtentHtmlReporter htmlReporterInstance; 
	public final String getCurrentlyLoggedInUser=System.getProperty("user.name");

	/**
	 * This is to create an extent manager instance before every new class
	 * @author saikiran.nataraja
	 */
	@BeforeClass
	public void createExtentInstance(){
		extentInstance = ExtentManager.GetExtent();
	}
	
	/**
	 * Function to initialize Extent report and it must be called only @Test annotation
	 * @author saikiran.nataraja
	 */	
	public void initializeExtentReport(){
		//Instantiating the ExtentReports
		String executingTestCaseName = super.getClass().getSimpleName();
		
		//Create testInstance
		testInstance=extentInstance.createTest(executingTestCaseName, "'"+executingTestCaseName+"' is used to check details in Application.");
		testInstance.assignAuthor(getCurrentlyLoggedInUser);
		testInstance.assignCategory("RegressionTestCases_Test");
	}

	@AfterClass
	public void tearDownFunction()  {
		// write all resources to report file
		extentInstance.flush();
	}
}
