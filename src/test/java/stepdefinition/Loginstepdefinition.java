package stepdefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.classes.Browser;
import page.classes.Homepage;

public class Loginstepdefinition {
	
	//public Browser b = new Browser();
	//public Homepage h = new Homepage();
	static String url = "http://vonage.com";
	@Given("^i am in homepage of Vonage website$")
	public void i_am_in_homepage_of_Vonage_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Browser.openbrowser(url);
	    
	}

	@When("^i click the personal link$")
	public void i_click_the_personal_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Homepage.NavigatetoPersonal(Browser.driver());
	    
	}

	@Then("^i should be directed to the personalpage$")
	public void i_should_be_directed_to_the_personalpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assert(Browser.assertpagecontent(Browser.driver(),"VoIP phone service"));
	}
}
