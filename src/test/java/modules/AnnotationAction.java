package modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.DashboardPO;

public class AnnotationAction {
	
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		Log.info("Creating a new Annotation" );

		DashboardPO.note.sendKeys(map.get("annotation"));
		Log.info(" is entered in Annotation text box" );
		
		DashboardPO.save.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("Create Annotation Action is successfully perfomred");
	}

}
