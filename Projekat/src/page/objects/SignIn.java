package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action"; // https://petstore.octoperf.com/actions/Account.action?signonForm=
	public static final String USERNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	public static final String PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	public static final String LOGIN_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	public static final String SIGNOUT_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	
	
	//Username  ////a[contains(text(),'Sign Out')]

	public static WebElement getUsername(WebDriver wd) {
		return wd.findElement(By.xpath(USERNAME_XPATH));
	}

	public static void clickUsername(WebDriver wd) {
		getUsername(wd).click();
	}

	public static void inputUsername(WebDriver wd, String data) {
		getUsername(wd).sendKeys(data);
	}
	
	//Password

	public static WebElement getPassword(WebDriver wd) {
		return wd.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	public static void inputPassword(WebDriver wd, String data) {
		getUsername(wd).sendKeys(data);
	}
	
	//Login

	public static WebElement getLogin(WebDriver wd) {
		return wd.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver wd) {
		getLogin(wd).click();
	}
	
	//Sign out
	
	public static WebElement getSignOut(WebDriver wd) {
		return wd.findElement(By.xpath(SIGNOUT_XPATH));
	}

	public static void clickSignOut(WebDriver wd) {
		getSignOut(wd).click();
	}

	public static void Waitme() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
