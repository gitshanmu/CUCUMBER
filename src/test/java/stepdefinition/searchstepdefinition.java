package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.classes.Browser;
import page.classes.Homepage;

public class searchstepdefinition {
	public Browser b = new Browser();
	public Homepage h = new Homepage();
	@When("^i enter \"(.*)\" in searchbox$")
	public void i_enter_personal_in_searchbox(String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Homepage.NavigatetoPersonal(Browser.driver());
		Homepage.searching(Browser.driver(), text);

	}

	@Then("^the page should display personal related contents$")
	public void the_page_should_display_personal_related_contents() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//"Search Results for personal from all of Vonage.com"
		assert(Browser.assertpagecontent(Browser.driver(),"Search Results for personal from all of Vonage.com"));
	}

}
