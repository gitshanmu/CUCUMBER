package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.classes.Browser;
import page.classes.Enterprisepagefactory;

public class Enterprisepagestepdefinition {
	static String url = "http://vonage.com";
	@Given("^i am in Firstpage of Vonage website$")
	public void i_am_in_Firstpage_of_Vonage_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Browser.refreshbrowser(url);
	    
	}
	@When("^i click the enterprise link$")
	public void i_click_the_enterprise_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		new Enterprisepagefactory(Browser.driver()).clickenterpriselinkfromfirstpage();
		 
	}

	@Then("^i should be directed to the enterprisepage$")
	public void i_should_be_directed_to_the_enterprisepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assert(Browser.assertpagecontent(Browser.driver, "Welcome to unified communications on your"));
	   
	}


}
