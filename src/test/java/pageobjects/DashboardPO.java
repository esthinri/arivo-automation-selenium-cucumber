package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPO {
	
	@FindBy(how=How.ID, using="note_text")
	public static WebElement note;
	
	@FindBy(how=How.LINK_TEXT, using="Anexar arquivo")
	public static WebElement attchement;
	
	@FindBy(how=How.LINK_TEXT, using="Salvar")
	public static WebElement save;
	
	@FindBy(how=How.CSS, using="note_text ng-binding ng-scope")
	public static WebElement annotations;

}
