package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enterprisepage {
	WebDriver driver;
	@FindBy(xpath="//li[@id='menu-item-1783']/a")
	WebElement Solutionstab;
	@FindBy(linkText="Support")
	WebElement Supporttab;
	@FindBy(linkText="Partners")
	WebElement Partnerstab;
	@FindBy(linkText="Why Vonage")
	WebElement WhyVonagetab;
	@FindBy(linkText="1-855-472-1895")
	WebElement EContacttab;
	
	public Enterprisepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public  void clickSolutionsTab(){
		Solutionstab.click();
	}
	public  void clickSupportTab(){
		Solutionstab.click();
	}
	public  void clickPartnersTab(){
		Solutionstab.click();
	}
	public  void clickWhyVonageTab(){
		Solutionstab.click();
	}
	public  void clickEcontactTab(){
		Solutionstab.click();
	}

}
