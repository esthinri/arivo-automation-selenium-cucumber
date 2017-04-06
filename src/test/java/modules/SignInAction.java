package modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import helpers.Log;
import pageobjects.HomePO;
import pageobjects.LoginPO;

public class SignInAction {
	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		HomePO.linkLogin.click();
		Log.info("Click action is perfromed on My Account link" );

		LoginPO.email.sendKeys(map.get("username"));

		Log.info(" is entered in UserName text box" );
		
		LoginPO.password.sendKeys(map.get("password"));
		Log.info(" is entered in Password text box" );

		LoginPO.signin_button.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");
	}

}
