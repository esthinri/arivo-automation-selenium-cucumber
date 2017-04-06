package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPO {

	@FindBy(how=How.ID, using="login_form_email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="login_form_password")
	public static WebElement password;
	
	@FindBy(how=How.NAME, using="commit")
	public static WebElement signin_button; 
}
