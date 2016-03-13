package page.classes;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class Browser {

	public static WebDriver driver = new FirefoxDriver();

	public static WebDriver driver() {

		return driver;
	}

	public static void openbrowser(String url) {
		driver.get(url);

	}
	public static void refreshbrowser(String url) throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.get(url);
		Thread.sleep(10000);

	}

	public static void closebrowser(){
		driver.close();
	}
	public static void alertaccept(WebDriver driver){
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	public static void alertdismiss(WebDriver driver){
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
	}
	public static boolean assertpagecontent(WebDriver driver,String text){
		return driver.getPageSource().contains(text);
		
	}

	
	
}
