package operations;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import configuration.Const;

/**
 * THIS IS THE MAIN CORE FILE FOR EXTENT REPORTS
 * @author saikiran.nataraja
 */
public class ExtentManager {
	
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private final static String filePath = Const.TestReportPath + "AutomationTestReport.html";
	
	public static ExtentReports GetExtent(){
		if (extent != null)
            return extent; //avoid creating new instance of HTML file if it is not null
		htmlReporter=getHtmlReporter();
        extent = new ExtentReports();		
        extent.setSystemInfo("Operating System", "Windows 7");
        extent.setSystemInfo("Selenium Version", "3.4");
        
		extent.attachReporter(htmlReporter);
		return extent;
	}
 
	private static ExtentHtmlReporter getHtmlReporter() {
		htmlReporter = new ExtentHtmlReporter(new File(filePath));		
        htmlReporter.loadXMLConfig(Const.ExtentConfigPath);
        htmlReporter.setAppendExisting(false);    
        return htmlReporter;
	}
	
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	}
}