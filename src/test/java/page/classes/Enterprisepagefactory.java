package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enterprisepagefactory {
	@FindBy(className = "enterpriseRight")
	WebElement firstpageenterpriselink;
	
	WebDriver driver;

	public Enterprisepagefactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public  void clickenterpriselinkfromfirstpage(){
		firstpageenterpriselink.click();
	}
}
