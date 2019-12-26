package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PutInBasket {
	
	public static final String URL1_XPATH = "https://petstore.octoperf.com/actions/Catalog.action ";
	public static final String AMAZONPARROT_XPATH = "//a[contains(text(),'AV-CB-01')]  ";
	public static final String CHOOSEAMAZON_XPATH = "//a[contains(text(),'EST-18')]  ";
	public static final String ADDTOCART_XPATH = "//a[@class='Button'] ";
	public static final String RATTLESNAKE_XPATH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]";
	public static final String CHOOSERATTLESNAKE_XPATH = " /html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/a[1] ";
	public static final String REMOVE_XPATH = " /html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[8]/a[1] ";
	public static final String MYORDERS_XPATH = " /html[1]/body[1]/div[2]/div[1]/a[1] ";
	public static final String MYACCOUNT_XPATH = " //a[contains(text(),'My Account')] ";
	public static final String CHECKOUT_XPATH = " /html[1]/body[1]/div[2]/div[2]/div[1]/a[1] ";
	public static final String CONTINUE_XPATH = " /html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	public static final String CONFIRM_XPATH = " /html[1]/body[1]/div[2]/div[2]/a[1]";
	
//	//Centralhugebird
//	
//	public static WebElement getCentralHugeBird(WebDriver wd) {
//		return wd.findElement(By.xpath(CENTRALHUGEBIRD_XPATH));
//	}
//
//	public static void clickCentralHugeBird(WebDriver wd) {
//		getCentralHugeBird(wd).click();
//	}
	
	//Amazonparrot
	
	public static WebElement getAmazonParrot(WebDriver wd) {
		return wd.findElement(By.xpath(AMAZONPARROT_XPATH));
	}

	public static void clickAmazonParrot(WebDriver wd) {
		getAmazonParrot(wd).click();
	}
	
	//Choose amazon
	
	public static WebElement getChooseAmazon(WebDriver wd) {
		return wd.findElement(By.xpath(CHOOSEAMAZON_XPATH));
	}

	public static void clickChooseAmazon(WebDriver wd) {
		getChooseAmazon(wd).click();
	}
	
	//Add to cart
	
	public static WebElement getAddToCart(WebDriver wd) {
		return wd.findElement(By.xpath(ADDTOCART_XPATH));
	}

	public static void clickAddToCart(WebDriver wd) {
		getAddToCart(wd).click();
	}
	
//	//Reptiles
//	
//	public static WebElement getReptiles(WebDriver wd) {
//		return wd.findElement(By.xpath(REPTILES_XPATH));
//	}
//
//	public static void clickReptiles(WebDriver wd) {
//		getReptiles(wd).click();
//	}
	
	//Rattlesnake
	
	public static WebElement getRattlesnake(WebDriver wd) {
		return wd.findElement(By.xpath(RATTLESNAKE_XPATH));
	}

	public static void clickRattlesnake(WebDriver wd) {
		getRattlesnake(wd).click();
	}
	
	//Chooserattlesnake
	
	public static WebElement getChooseRattlesnake(WebDriver wd) {
		return wd.findElement(By.xpath(CHOOSERATTLESNAKE_XPATH));
	}

	public static void clickChooseRattlesnake(WebDriver wd) {
		getChooseRattlesnake(wd).click();
	}
	
	//Remove
	
	public static WebElement getRemove(WebDriver wd) {
		return wd.findElement(By.xpath(REMOVE_XPATH));
	}

	public static void clickRemove(WebDriver wd) {
		getRemove(wd).click();
	}
	
	//My orders
	
	public static WebElement getMyOrders(WebDriver wd) {
		return wd.findElement(By.xpath(MYORDERS_XPATH));
	}

	public static void clickMyOrders(WebDriver wd) {
		getMyOrders(wd).click();
	}
	
	//My account
	
	public static WebElement getMyAccount(WebDriver wd) {
		return wd.findElement(By.xpath(MYACCOUNT_XPATH));
	}

	public static void clickMyAccount(WebDriver wd) {
		getMyAccount(wd).click();
	}
	
	//Checkout
	
	public static WebElement getCheckout(WebDriver wd) {
		return wd.findElement(By.xpath(CHECKOUT_XPATH));
	}

	public static void clickCheckout(WebDriver wd) {
		getCheckout(wd).click();
	}
	
	//Continue
	
	public static WebElement getContinue(WebDriver wd) {
		return wd.findElement(By.xpath(CONTINUE_XPATH));
	}

	public static void clickContinue(WebDriver wd) {
		getContinue(wd).click();
	}
	
	//Confirm
	
	public static WebElement getConfirm(WebDriver wd) {
		return wd.findElement(By.xpath(CONFIRM_XPATH));
	}

	public static void clickConfirm(WebDriver wd) {
		getConfirm(wd).click();
	}
	
	
	
	
	
	public static void Waitme18() {
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
	
	

	
	
	
	


