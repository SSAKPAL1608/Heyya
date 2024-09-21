package Generic_method;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentReports extent;
	
	public static String getReportName() {
		Date d = new Date();
		String fileName ="AutomationReport_"+d.toString().replace(":", "_").replace(" ", "_")+".html";
		return fileName;
	}
	
	
	public static ExtentReports createInstance() {

		String filename = getReportName();
		String directory = System.getProperty("user.dir")+"/Reports/";
		
		new File(directory).mkdirs();
		String path = directory + filename;
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(path);
		htmlReport.config().setEncoding("utf-8");
		htmlReport.config().setDocumentTitle("ReportsTitle");
		htmlReport.config().setReportName("ReportsDemo");
		htmlReport.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		return extent;
		
	}

}
