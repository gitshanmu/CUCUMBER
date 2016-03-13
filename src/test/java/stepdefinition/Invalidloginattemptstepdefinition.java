package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.classes.Browser;
import page.classes.Homepage;

public class Invalidloginattemptstepdefinition {
	public Browser b = new Browser();
	public Homepage h = new Homepage();
	String url = "http://vonage.com";
	
	@When("^Hover over the Sign/In link and Enter invalid credentials$")
	public void hover_over_the_Sign_In_link_and_Enter_invalid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				Homepage.clicksigninhoverover(Browser.driver(),"tester800","test2");
	   
	}
	
	@Then("^System should be directed to login page$")
	public void system_should_be_directed_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assert(Browser.assertpagecontent(Browser.driver(),"Sign in to your Vonage Account"));
	}

	@Then("^Error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
		assert(Browser.assertpagecontent(Browser.driver(),"The information you entered does not match what we have on file"));
	}



}
