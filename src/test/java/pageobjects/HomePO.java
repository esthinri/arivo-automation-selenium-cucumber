package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePO {
	
	@FindBy(how=How.LINK_TEXT, using="Login")
	public static WebElement linkLogin;


}
