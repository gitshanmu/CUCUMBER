package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Personalpage {
	public static WebElement element = null;
	public static WebElement elementsub = null;
	public static WebElement Personaltab(WebDriver driver){
		element=driver.findElement(By.linkText("PERSONAL"));
		return element;
		}
	public static WebElement Businesstab(WebDriver driver){
		element=driver.findElement(By.linkText("SMALL BUSINESS"));
		return element;
		}
	public static WebElement Enterprisetab(WebDriver driver){
		element=driver.findElement(By.linkText("MID-MARKET & ENTERPRISE"));
		return element;
		}
	public static WebElement whyvonagesubtab(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='c1394404623965']//a[(text()='Why Vonage')]"));
		return element;
		}
	//See why you should switch to Vonage
	public static WebElement whyvonagesubtablist1(WebDriver driver){
		element=driver.findElement(By.xpath("//div[@id='c1394404623965']//a[(text()='See why you should switch to Vonage')]"));
		return element;
		}
	//How Vonage Works
	public static WebElement whyvonagesubtablist2(WebDriver driver){
		element=driver.findElement(By.xpath("//a[(text()='How Vonage Works')]"));
		return element;
		}
	//Customer Reviews
	public static WebElement whyvonagesubtablist3(WebDriver driver){
		element=driver.findElement(By.xpath("//a[(text()='Customer Reviews')]"));
		return element;
		}
	//Awards & Reviews
	public static WebElement whyvonagesubtablist4(WebDriver driver){
		element=driver.findElement(By.xpath("//a[(text()='Awards & Reviews')]"));
		return element;
		}
	public static WebElement planssubtab(WebDriver driver){
		element=driver.findElement(By.xpath("//a[(text()='Plans')]"));
		return element;
		}
	public static WebElement Featuressubtab(WebDriver driver){
		element=driver.findElement(By.xpath("//a[(text()='Features')]"));
		return element;
		}
	public static void NavigatetoEnterprisetab(WebDriver driver){
		element=Enterprisetab(driver);
		element.click();
	}
	public static void NavigatetoBusinesstab(WebDriver driver){
		element=Businesstab(driver);
		element.click();
	}
	public static void NavigatetoPersonaltab(WebDriver driver){
		element=Personaltab(driver);
		element.click();
	}
	
	public static void Navigate_WhyVonagelist1(WebDriver driver) throws InterruptedException{
		WebElement element = whyvonagesubtab(driver);
		WebElement elementsub = whyvonagesubtablist1(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		action.moveToElement(elementsub).click().perform();
		Thread.sleep(2000);		
	}
	public static void Navigate_WhyVonagelist2(WebDriver driver) throws InterruptedException{
		
		WebElement element = whyvonagesubtab(driver);
		WebElement elementsub = whyvonagesubtablist2(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(200);
		action.moveToElement(elementsub).click().perform();
		Thread.sleep(200);
	}
	public static void Navigate_WhyVonagelist3(WebDriver driver) throws InterruptedException{
		
		WebElement element = whyvonagesubtab(driver);
		WebElement elementsub = whyvonagesubtablist3(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(200);
		action.moveToElement(elementsub).click().perform();
		Thread.sleep(200);	
	}
	
	public static void Navigate_WhyVonagelist4(WebDriver driver) throws InterruptedException{
		
		WebElement element = whyvonagesubtab(driver);
		WebElement elementsub = whyvonagesubtablist4(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(200);
		action.moveToElement(elementsub).click().perform();
		Thread.sleep(200);
	}
	
}
