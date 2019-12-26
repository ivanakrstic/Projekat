package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	

	public static void Waitme15() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//ulazak na pocetnu stranu

	public static final String URL="https://petstore.octoperf.com/";
	private static final String ENTERSTORE_XPATH="//a[contains(text(),'Enter the Store')]";
	
	public static WebElement getEnterTheStore (WebDriver wd) {
		return wd.findElement(By.xpath(ENTERSTORE_XPATH));
	}
	public static void clickEnterTheStore(WebDriver wd) {
		getEnterTheStore(wd).click();
		
		
	}

}




