package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Homepage {
	public static WebElement element = null;
	public static WebElement Personal(WebDriver driver){
		element=driver.findElement(By.className("personalLink"));
		return element;
		/**
		 * @FindBy(css = TOASTER_CSS)
	       private WebElement TOASTER_CSS_ELEM;
		 */
		}
	public static WebElement Business(WebDriver driver){
		element=driver.findElement(By.className("businessLink"));
		return element;
		}
	public static WebElement Enterprise(WebDriver driver){
		element=driver.findElement(By.className("enterpriseLink"));
		return element;
		}
	public static WebElement search(WebDriver driver){
		element=driver.findElement(By.id("search"));
		return element;
		}
	public static void NavigatetoPersonal(WebDriver driver){
		element=Personal(driver);
		element.click();
	}
	public static void NavigatetoBusiness(WebDriver driver){
			element=Business(driver);
			element.click();	
		}
	public static void NavigatetoEnterprise(WebDriver driver){
		element=Enterprise(driver);
		element.click();
		}
	public static void searching(WebDriver driver,String Text){
		element=search(driver);
		element.sendKeys(Text);
		element.sendKeys(Keys.RETURN);
		}
	public static void clicksigninhoverover(WebDriver driver,String username,String password) throws InterruptedException{
		WebElement mainMenu = driver.findElement(By.linkText("Sign In/My Account"));
		WebElement subMenu1 = driver.findElement(By.id("username"));
		WebElement subMenu2 = driver.findElement(By.id("password"));
		//input[type="submit"][value="Sign In"]
		WebElement subMenu3 = driver.findElement(By.cssSelector("input[type='submit'][value='Sign In']"));
		Actions actions = new Actions(driver);		
		actions.moveToElement(mainMenu);		
		actions.moveToElement(subMenu1).click().build().perform();		
		//actions.moveToElement(subMenu2);
		actions.sendKeys(username).build().perform();
		actions.moveToElement(subMenu2).click().build().perform();		
		actions.sendKeys(password).build().perform();
		actions.moveToElement(subMenu3).click().build().perform();
		System.out.println("Inside this loop-submenu1");
		Thread.sleep(10000);
						
	}
}
