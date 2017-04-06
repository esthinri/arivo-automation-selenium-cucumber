package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Log;
import modules.SignInAction;
import pageobjects.DashboardPO;
import pageobjects.HomePO;
import pageobjects.LoginPO;

public class AnnotationSD {
	public WebDriver driver;
	public static List<HashMap<String, String>> datamap = null;
	private String value = "Teste de Automação";

	public AnnotationSD() {
		driver = Hooks.driver;

		datamap = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> sampleData = new HashMap<String, String>();
		sampleData.put("username", "esthinri@gmail.com");
		sampleData.put("password", "eah1989D");
		//sampleData.put("annotation", "Teste de Automação");
		System.out.println("Current data" + sampleData);
		datamap.add(sampleData);
	}

	@When("^I open Arivo SW$")
	public void i_open_Arivo_SW() throws Throwable {
		driver.get("https://arivo.com.br/");
	}
	
	@When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, HomePO.class);
		PageFactory.initElements(driver, LoginPO.class);

		SignInAction.Execute(driver,datamap.get(0));
    }

	@Then("^I digit a new annotation$")
	public void i_digit_a_new_annotation() throws Throwable {
		PageFactory.initElements(driver, DashboardPO.class);
		DashboardPO.note.sendKeys(value);
		Log.info(" is entered in Annotation text box" );
		
		
	}

	@Then("^I click in save$")
	public void i_click_in_save() throws Throwable {
		DashboardPO.save.click();
		Log.info("Click action is performed on Submit button");
	}

	@Then("^I verify the annotation$")
	public void i_verify_the_annotation() throws Throwable {
		Log.info("Verify Annotation is saved");
		boolean saved = driver.getPageSource().contains(value);
		if (saved == true){
			Reporter.log("Annotation is successfully saved");
		} else{
			Reporter.log("Annotation is unsuccessfully saved");
		}
			
		Thread.sleep(20000);
	}
	
	@Then("^I delete Annotation$")
	public void i_delete_Annotation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	

}
