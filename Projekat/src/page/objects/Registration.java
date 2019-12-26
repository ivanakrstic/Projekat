package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	//User information
	
	public static final String URL="https://petstore.octoperf.com/actions/Account.action?signonForm=";  //https://petstore.octoperf.com/actions/Catalog.action
	public static final String REGISTERNOW_XPATH="//a[contains(text(),'Register Now!')] ";
	public static final String USERID_XPATH="/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	public static final String PASSWORD_XPATH="/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	public static final String RPASSWORD_XPATH="/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	
	//Account information
	
	public static final String FIRSTNAME_XPATH="//input[@name='account.firstName']";  
	public static final String LASTNAME_XPATH="//input[@name='account.lastName']";
	public static final String EMAIL_XPATH="//input[@name='account.email']";
	public static final String PHONE_XPATH="//input[@name='account.phone'] ";
	public static final String ADRESS1_XPATH="//input[@name='account.address1']";
	public static final String ADRESS2_XPATH="//input[@name='account.address2']";
	public static final String CITY_XPATH="//input[@name='account.city']";
	public static final String STATE_XPATH="//input[@name='account.state']";
	public static final String ZIP_XPATH="//input[@name='account.zip']";
	public static final String COUNTRY_XPATH="//input[@name='account.country'] ";
	
	//Profile information
	
	public static final String SLT_LANGUAGE_XPATH="//select[@name='account.languagePreference']";
	public static final String SLT_CATEGORY_XPATH="//select[@name='account.favouriteCategoryId']";
	public static final String MYLIST_XPATH="//input[@name='account.listOption']";
	public static final String MYBANNER_XPATH="//input[@name='account.listOption'] ";
	public static final String SAVEACCOUNT_XPATH="/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	
	//Register now
	
	public static WebElement getRegisterNow(WebDriver wd) {
		return wd.findElement(By.xpath(REGISTERNOW_XPATH));
	}

	public static void clickRegisterNow(WebDriver wd) {
		getRegisterNow(wd).click();
	}
	
	
	//User id
	
	public static WebElement getUserId(WebDriver wd) {
		return wd.findElement(By.xpath(USERID_XPATH));
	}

	public static void clickUserId(WebDriver wd) {
		getUserId(wd).click();
	}

	public static void inputUserId(WebDriver wd, String data) {
		getUserId(wd).sendKeys(data);
	}
	
	//Password
	
	public static WebElement getPassword(WebDriver wd) {
		return wd.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	public static void inputPassword(WebDriver wd, String data) {
		getPassword(wd).sendKeys(data);
	}
	
	//Repeat password
	
	public static WebElement getRepeatPassword(WebDriver wd) {
		return wd.findElement(By.xpath(RPASSWORD_XPATH));
	}

	public static void clickRepeatPassword(WebDriver wd) {
		getRepeatPassword(wd).click();
	}

	public static void inputRepeatPassword(WebDriver wd, String data) {
		getRepeatPassword(wd).sendKeys(data);
	}
	
	
	//First name
	
	public static WebElement getFirstName(WebDriver wd) {
		return wd.findElement(By.xpath(FIRSTNAME_XPATH));
	}

	public static void clickFirstName(WebDriver wd) {
		getFirstName(wd).click();
	}

	public static void inputFirstName(WebDriver wd, String data) {
		getFirstName(wd).sendKeys(data);
	}
	
	//Last name
	
	public static WebElement getLastName(WebDriver wd) {
		return wd.findElement(By.xpath(LASTNAME_XPATH));
	}

	public static void clickLastName(WebDriver wd) {
		getLastName(wd).click();
	}

	public static void inputLastName(WebDriver wd, String data) {
		getLastName(wd).sendKeys(data);
	}
	
	//Email
	
	public static WebElement getEmail(WebDriver wd) {
		return wd.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver wd) {
		getEmail(wd).click();
	}

	public static void inputEmail(WebDriver wd, String data) {
		getEmail(wd).sendKeys(data);
	}
	
	//Phone
	
	public static WebElement getPhone(WebDriver wd) {
		return wd.findElement(By.xpath(PHONE_XPATH));
	}

	public static void clickPhone(WebDriver wd) {
		getPhone(wd).click();
	}

	public static void inputPhone(WebDriver wd, String data) {
		getPhone(wd).sendKeys(data);
	}
	
	//Adress1
	
	public static WebElement getAdress1(WebDriver wd) {
		return wd.findElement(By.xpath(ADRESS1_XPATH));
	}

	public static void clickAdress1(WebDriver wd) {
		getAdress1(wd).click();
	}

	public static void inputAdress1(WebDriver wd, String data) {
		getAdress1(wd).sendKeys(data);
	}
	
	//Adress2
	
	public static WebElement getAdress2(WebDriver wd) {
		return wd.findElement(By.xpath(ADRESS2_XPATH));
	}

	public static void clickAdress2(WebDriver wd) {
		getAdress2(wd).click();
	}

	public static void inputAdress2(WebDriver wd, String data) {
		getAdress2(wd).sendKeys(data);
	}
	
	//City
	
	public static WebElement getCity(WebDriver wd) {
		return wd.findElement(By.xpath(CITY_XPATH));
	}

	public static void clickCity(WebDriver wd) {
		getCity(wd).click();
	}

	public static void inputCity(WebDriver wd, String data) {
		getCity(wd).sendKeys(data);
	}
	
	//State
	
	public static WebElement getState(WebDriver wd) {
		return wd.findElement(By.xpath(STATE_XPATH));
	}

	public static void clickState(WebDriver wd) {
		getState(wd).click();
	}

	public static void inputState(WebDriver wd, String data) {
		getState(wd).sendKeys(data);
	}
	
	//Zip
	
	public static WebElement getZip(WebDriver wd) {
		return wd.findElement(By.xpath(ZIP_XPATH));
	}

	public static void clickZip(WebDriver wd) {
		getZip(wd).click();
	}

	public static void inputZip(WebDriver wd, String data) {
		getZip(wd).sendKeys(data);
	}
	
	//Country
	
	public static WebElement getCountry(WebDriver wd) {
		return wd.findElement(By.xpath(COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver wd) {
		getZip(wd).click();
	}

	public static void inputCountry(WebDriver wd, String data) {
		getCountry(wd).sendKeys(data);
	}
	
	//Select language
	
	public static Select getLanguage(WebDriver wd) {
		return new Select(wd.findElement(By.xpath(SLT_LANGUAGE_XPATH)));
	}

	public static void inputLanguage(WebDriver wd,String data) {
		getLanguage(wd).selectByVisibleText(data);
	}
	
	//Select category
	
	public static Select getCategory(WebDriver wd) {
		return new Select(wd.findElement(By.xpath(SLT_CATEGORY_XPATH)));
	}

	public static void inputCategory(WebDriver wd,String data) {
		getCategory(wd).selectByVisibleText(data);
	}
	
	//My list
	
	public static Select getList(WebDriver wd) {
		return new Select(wd.findElement(By.xpath(MYLIST_XPATH)));
	}
	
	
	//My banner
	
	public static Select getBanner(WebDriver wd) {
		return new Select(wd.findElement(By.xpath(MYBANNER_XPATH)));
	}
	
	//Save account
	
	public static WebElement getSaveAccount(WebDriver wd) {
		return wd.findElement(By.xpath(SAVEACCOUNT_XPATH));
	}

	public static void clickSaveAccount(WebDriver wd) {
		getSaveAccount(wd).click();
	}
	
	
}
