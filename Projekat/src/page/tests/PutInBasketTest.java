package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.PetStoreMenu;
import page.objects.PutInBasket;

public class PutInBasketTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Crome Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(PutInBasket.URL1_XPATH);
		PetStoreMenu.clickCentralHugeBird(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickAmazonParrot(wd);
		PutInBasket.clickChooseAmazon(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickAddToCart(wd);
		PutInBasket.Waitme18();
		wd.get(PutInBasket.URL1_XPATH);
		PutInBasket.Waitme18();
		PetStoreMenu.clickReptiles(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickRattlesnake(wd);
		PutInBasket.Waitme18();
		PutInBasket.clickChooseRattlesnake(wd);
		PutInBasket.clickAddToCart(wd);

		// PutInBasket.clickRemove(wd);
		// PutInBasket.clickBasket(wd);
	}

}
