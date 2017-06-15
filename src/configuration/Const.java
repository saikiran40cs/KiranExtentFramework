/*'*************************************************************************************************************************************************
' Class Name			: Const
' Description			: Used to store the variables that are used across.
' How to Use			:
'-----------------------------------------------------------------
' Author                    Version          Creation Date         
'-----------------------------------------------------------------
' Sai Kiran Nataraja         v1.0             16-December-2016		
'*************************************************************************************************************************************************
*/
package configuration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/** @author saikiran.nataraja*/

public final class Const{
	
	
	//For Report start time and End time format
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss",Locale.ENGLISH);
	public static final String fs=File.separator;
	public static final String ExtentConfigPath=System.getProperty("user.dir")+fs+"src"+fs+Const.class.getPackage().getName().replace(".",fs)+fs+"extent-config.xml";
	public static String TestReportPath=System.getProperty("user.dir")+fs+"ExtentReports"+fs;
	public static final String strDownloadPath=System.getProperty("user.dir")+fs+"Downloads"+fs;
	//Driver path location
	public static final String firefoxDriverPath=System.getProperty("user.dir")+fs+"src"+fs+Const.class.getPackage().getName().replace(".",fs)+fs+"WebDriver_geckodriver.exe";
	public static final String chromeDriverPath=System.getProperty("user.dir")+fs+"src"+fs+Const.class.getPackage().getName().replace(".",fs)+fs+"WebDriver_chromedriver.exe";
	public static final String IEDriverPath=System.getProperty("user.dir")+fs+"src"+fs+Const.class.getPackage().getName().replace(".",fs)+fs+"WebDriver_IEDriverServer.exe";
	public static final String operaDriverPath=System.getProperty("user.dir")+fs+"src"+fs+Const.class.getPackage().getName().replace(".",fs)+fs+"WebDriver_operadriver.exe";
	
	private Const() {
		throw new IllegalAccessError("Const class");
	}
}
